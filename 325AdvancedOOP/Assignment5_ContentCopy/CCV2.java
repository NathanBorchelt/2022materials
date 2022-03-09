import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.awt.GridLayout;


public class CCV2 extends JFrame implements ActionListener{
    private JList<Content<String>> inJList;
    private JList<Content<String>> outJList;
    private JMenuBar menubar;
    private JMenu loadOption;
    private JMenu saveOption;
    private JLabel loadSuccess;
    private JFileChooser fc;
    private JLabel spacingLabel;
    private JButton addButton;
    private JButton removeButton;

    public static void main(String[] args) {
        CCV2 ccv2 = new CCV2();
        ccv2.setVisible(true);
    }

    public CCV2(){
        setSize(640,480);

        setDefaultCloseOperation(CCV2.EXIT_ON_CLOSE);
        DefaultListModel<Content<String>> inModel = new DefaultListModel<>();
        DefaultListModel<Content<String>> outModel = new DefaultListModel<>();

        JPanel mainPanel = new JPanel(new GridLayout(1,3));

        spacingLabel = new JLabel("\t");
        JPanel centerPanel = new JPanel(new GridLayout(5,1));

        inJList = new JList<>();
        outJList = new JList<>();

        loadSuccess = new JLabel("Awaiting File");

        inJList.setModel(inModel);
        outJList.setModel(outModel);

        loadOption = new JMenu("Load...");
        saveOption = new JMenu("Save As...");

        loadOption.addActionListener(this);
        saveOption.addActionListener(this);

        fc = new JFileChooser();

        menubar = new JMenuBar();
        menubar.add(loadOption);
        menubar.add(saveOption);

        setJMenuBar(menubar);

        addButton = new JButton("Add >>");
        removeButton = new JButton("<< Remove");

        addButton.addActionListener(new AddItemsListener());
        removeButton.addActionListener(new RemoveItemsListener());

        add(menubar);
        add(mainPanel);
        mainPanel.add(inJList);
        mainPanel.add(centerPanel);
        centerPanel.add(loadSuccess);
        centerPanel.add(addButton);
        centerPanel.add(spacingLabel);
        centerPanel.add(removeButton);
        centerPanel.add(spacingLabel);
        mainPanel.add(outJList);

    }

    @SuppressWarnings("unchecked")
    public void actionPerformed(ActionEvent e) {

        //Handle open button action.
        System.out.println("file chooser listened");
        if (e.getSource() == loadOption) {
            int returnVal = fc.showOpenDialog(CCV2.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                //This is where a real application would open the file.
                loadSuccess.setText("Opening: " + file.getName());
                BufferedReader objReader = null;
                try {
                    String strCurrentLine;
                    int index = 0;
                    objReader = new BufferedReader(new FileReader(file));
                    while ((strCurrentLine = objReader.readLine()) != null) {
                        ((DefaultListModel)(inJList.getModel())).addElement(new Content<String>(strCurrentLine,index));
                        index++;
                    }
                }
                catch (Exception ex) {
                    System.err.println(ex.getMessage());
                    loadSuccess.setText("Error reading from " + file.getName());
                }
                finally {
                try {
                    if (objReader != null)
                    objReader.close();
                }
                catch (Exception ex) {
                    System.err.println(ex.getMessage());
                    loadSuccess.setText("Failed to close " + file.getName());
                }
                }
            }
            else {
                loadSuccess.setText("Open command cancelled by user.");
            }

        //Handle save button action.
        }

        else if (e.getSource() == saveOption) {
            int returnVal = fc.showSaveDialog(CCV2.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();

                try{
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                }
                catch (Exception exce){
                    System.err.println(exce.getMessage());
                    loadSuccess.setText("Error creating new file for saving");
                }

                BufferedWriter bw = null;

                try{
                    FileWriter fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);
                }
                catch (Exception excep){
                    System.err.println(excep.getMessage());
                    loadSuccess.setText("Error attempting to write to file");
                }

                try{
                    for(Content<String> content: ((Content<String>[])((DefaultListModel)(outJList.getModel())).toArray())){
                        bw.write(content.getContent());
                        bw.newLine();
                    }
                }
                catch(Exception exc){
                    System.err.println(exc.getMessage());
                    loadSuccess.setText("Failed to save to " + file.getName());
                }
            }
            else {
                loadSuccess.setText("Save command cancelled by user.");
            }
        }
    }
    @SuppressWarnings("unchecked")
    private class AddItemsListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                List<Content<String>> moving = inJList.getSelectedValuesList();
                for(Content<String> content: moving){
                    ((DefaultListModel)inJList.getModel()).removeElement(content);
                    ((DefaultListModel)outJList.getModel()).addElement(content);
                }

                List<Content<String>> unorganizedList = Arrays.asList((Content<String>[])((DefaultListModel)(outJList.getModel())).toArray());
                Collections.sort(unorganizedList);
                ((DefaultListModel)outJList.getModel()).clear();
                for(Content<String> content: unorganizedList){
                    ((DefaultListModel)outJList.getModel()).addElement(content);
                }
            }
            catch(Exception addException){
                loadSuccess.setText("There is no file loaded");
            }
        }
    }
    @SuppressWarnings("unchecked")
    private class RemoveItemsListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                List<Content<String>> moving = outJList.getSelectedValuesList();
                for(Content<String> content: moving){
                    ((DefaultListModel)outJList.getModel()).removeElement(content);
                    ((DefaultListModel)inJList.getModel()).addElement(content);
                }

                List<Content<String>> unorganizedList = Arrays.asList((Content<String>[])((DefaultListModel)(inJList.getModel())).toArray());
                Collections.sort(unorganizedList);
                ((DefaultListModel)inJList.getModel()).clear();
                for(Content<String> content: unorganizedList){
                    ((DefaultListModel)inJList.getModel()).addElement(content);
                }
            }
            catch(Exception removeException){
                loadSuccess.setText("There is no file loaded");
            }
        }
    }
}

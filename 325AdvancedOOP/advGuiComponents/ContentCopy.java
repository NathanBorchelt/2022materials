import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.util.Scanner;
public class ContentCopy extends JFrame{
    public static Scanner in = new Scanner();
    public ContentCopy(){
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel padding = new JLabel();
        JButton addButton = new JButton("Add >>");
        JButton removeButton = new JButton("Remove >>");
        JPanel mainPanel = new JPanel(new GridLayout(3,1));
        JPanel buttonPanel = new JPanel(new GridLayout(1,5));
        JList<String> listIn = new JList<>();
        JList<String> listOut = new JList<>();

        add(mainPanel);
        mainPanel.add(listIn);
        mainPanel.add(buttonPanel);
        mainPanel.add(listOut);
        buttonPanel.add(padding);
        buttonPanel.add(addButton);
        buttonPanel.add(padding);
        buttonPanel.add(removeButton);
        buttonPanel.add(padding);
        setVisible(true);
    }

    public void addSourceElements(Object newValue[]) {
        fillListModel(sourceListModel, newValue);
      }
      public void setSourceElements(Object newValue[]) {
        clearSourceListModel();
        addSourceElements(newValue);
      }
      public void addDestinationElements(Object newValue[]) {
        fillListModel(destListModel, newValue);
      }
      private void fillListModel(SortedListModel model, Object newValues[]) {
        model.addAll(newValues);
      }

      public class FileManagmentButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            //Handle open button action.
            if (e.getSource() == openButton) {
                int returnVal = fc.showOpenDialog(FileChooserDemo.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    in = new Scanner(file);
                    while(in.hasNextLine()){
                        listIn.add(in.nextLine());
                    }
                } else {
                    log.append("Open command cancelled by user." + "\n");
                }
                log.setCaretPosition(log.getDocument().getLength());

            //Handle save button action.
            } else if (e.getSource() == saveButton) {
                int returnVal = fc.showSaveDialog(FileChooserDemo.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    //This is where a real application would save the file.
                    log.append("Saving: " + file.getName() + "." + "\n");
                } else {
                    log.append("Save command cancelled by user." + "\n");
                }
                log.setCaretPosition(log.getDocument().getLength());
            }
        }
    }
    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          Object selected[] = sourceList.getSelectedValues();
          addDestinationElements(selected);
          clearSourceSelected();
        }
      }
      private class RemoveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          Object selected[] = destList.getSelectedValues();
          addSourceElements(selected);
          clearDestinationSelected();
        }
      }
}

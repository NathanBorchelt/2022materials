import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class FileViewer extends JPanel{
    private JButton openFile, saveFile;
    private TextArea fileView;
    JFileChooser fileChooser;
    static private final String newline = "\n";

    public static void main(String[] args) {
        FileViewer viewer = new FileViewer();
    }

    public FileViewer(){
        super(new BorderLayout());

        fileView = new JTextArea(5,20);
        fileView.setMargin(new Insets(5,5,5,5));
        fileView.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(fileview);

        fileChooser = new JFileChooser();

        openFile = new JButton("Open a file");
        saveFile = new JButton("Save a file");

        openFile.addActionListener(new OpenFileListener());
        saveFile.addActionListener(new SaveFileListener());

        JPanel buttonPanel = new JPanel(); //use FlowLayout
        buttonPanel.add(openFile);
        buttonPanel.add(saveFile);
        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);

    }

    public class OpenFileListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int returnVal = fileChooser.showOpenDialog(FileChooserDemo.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                BufferedReader objReader = null;
                try {
                    String strCurrentLine;
                    objReader = new BufferedReader(new FileReader(file));
                    String outString = "";
                    while ((strCurrentLine = objReader.readLine()) != null) {
                        fileView.append(strCurrentLine);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                try {
                    if (objReader != null)
                    objReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                }
            } else {
                fileView.append("Open command cancelled by user." + "\n");
            }
            fileView.setCaretPosition(log.getDocument().getLength());
        }
    }

    public class SaveFileListener implements ActionListener{
        int returnVal = fileChooser.showSaveDialog(FileViewer.this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            BufferedWriter bw = null;
            try {
                File file = new File(fileView.getText());

                    /* This logic will make sure that the file
                * gets created if it is not present at the
                * specified location*/
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write(fileView.getText());
                    System.out.println("File written Successfully");

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            finally
            {
            try{
                if(bw!=null)
                bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
                }
            }
        }
        else {
            fileView.append("Save command cancelled by user." + "\n");
        }
        fileView.setCaretPosition(fileView.getDocument().getLength());
    }
}

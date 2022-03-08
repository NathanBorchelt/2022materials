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

    public static void main(String[] args) {
      ContentCopy cc = new ContentCopy();
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

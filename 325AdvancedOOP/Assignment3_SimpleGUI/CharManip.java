import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharManip extends JFrame{

    private JPanel panel = new JPanel();
    private JTextArea inputArea = new JTextArea(3,21);
    private JLabel numOfCharsStr = new JLabel("Number of Character: ");
    private JTextField numCharsOut = new JTextField(10);
    private JTextArea rvrsOut = new JTextArea(3,21);
    private JButton countButton = new JButton("Count Characters");
    private JButton rvrsButton = new JButton("Reverse String");

    public static void main(String[] args) {
        CharManip cM = new CharManip();
    }
    public CharManip(){
        this.setSize(640,480);
        this.add(panel);
        panel.add(inputArea);
        panel.add(countButton);
        panel.add(numOfCharsStr);
        panel.add(numCharsOut);
        panel.add(rvrsButton);
        panel.add(rvrsOut);
        countButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                numCharsOut.setText(String.valueOf(inputArea.getText().length()));
            }
        });
        rvrsButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //https://www.geeksforgeeks.org/reverse-a-string-in-java/
                StringBuilder stringToBeRvrsd = new StringBuilder(inputArea.getText());
                rvrsOut.setText(stringToBeRvrsd.reverse().toString());
            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

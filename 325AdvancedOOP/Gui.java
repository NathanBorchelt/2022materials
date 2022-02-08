import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Gui {
    private JFrame frame = new JFrame("Our First GUI");
    private JButton button = new JButton("Click Me!!!");
    private JPanel panel = new JPanel();
    private JLabel label1 = new JLabel("Default Text 1");
    private JTextField textField = new JTextField("Field Text");
    private JTextArea textArea = new JTextArea("Area Text");

    public Gui(){
        frame.add(panel);
        panel.add(button);
        panel.add(label1);
        panel.add(textArea);
        panel.add(textField);
        button.addActionListener(new ButtonListener());
        frame.setVisible(true);
        frame.setSize(400,600);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Gui g = new Gui();
    }

    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            label1.setText(textField.getText());
            textArea.append(textField.getText());
        }
    }
}

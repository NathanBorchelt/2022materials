import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Gui extends JFrame {
    private JButton button = new JButton("Click Me!!!");
    private JPanel panel = new JPanel();
    private JLabel label1 = new JLabel("Default Text 1");
    private JTextField textField = new JTextField("Field Text");
    private JTextArea textArea = new JTextArea(4,4);
    private JScrollPane scrollPane = new JScrollPane(textArea);

    public Gui(){
        this.add(panel);
        panel.add(button);
        panel.add(label1);
        panel.add(scrollPane);
        panel.add(textField);
        this.setVisible(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //frame.setResizable(false);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "You clicked Me");
                label1.setText(textField.getText());
                textArea.append(textField.getText());
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Gui g = new Gui();
        g.setSize(400,400);
    }

    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            label1.setText(textField.getText());
            textArea.append(textField.getText());
        }
    }
}

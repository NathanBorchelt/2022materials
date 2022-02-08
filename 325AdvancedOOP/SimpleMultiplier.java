import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleMultiplier {
    JFrame frame = new JFrame("Simple Multiplier");
    JButton multButton = new JButton("Multiply these two numbers");
    JLabel outLabel = new JLabel("Output will appear here.");
    JTextArea numIn1 = new JTextArea(""+100);
    JLabel spacing = new JLabel("\t");
    JTextArea numIn2 = new JTextArea(""+100);
    JPanel panel = new JPanel();


    public SimpleMultiplier(){
        frame.add(panel);
        panel.add(outLabel);
        panel.add(spacing);
        panel.add(multButton);
        panel.add(spacing);
        panel.add(numIn1);
        panel.add(spacing);
        panel.add(numIn2);
        multButton.addActionListener(new MultiplierListener());
        frame.setVisible(true);
        frame.setSize(400,600);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SimpleMultiplier sM = new SimpleMultiplier();
    }

    public class MultiplierListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            outLabel.setText((""+ (Double.valueOf(numIn1.getText())*Double.valueOf(numIn2.getText()))));
        }
    }
}

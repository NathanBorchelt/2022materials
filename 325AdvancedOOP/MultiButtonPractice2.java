import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MultiButtonPractice2 extends JFrame{

    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    private JButton[] nineButtons = new JButton[9];

    public static void main(String[] args) {
        MultiButtonPractice2 mBP2 = new MultiButtonPractice2();
    }

    public MultiButtonPractice2(){
        this.setSize(640,480);
        this.add(panel);
        panel.add(new JLabel());
        panel.add(label);
        panel.add(new JLabel());
        panel.setLayout(new GridLayout(4,3));
        for (int y = 0; y < 3; y++) {
            for(int x = 0; x < 3; x++){
                nineButtons[y*3+x] = new JButton(String.valueOf(y*3+x+1));
                nineButtons[y*3+x].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        for(JButton button: nineButtons){
                            if(e.getSource().equals(button)){
                                label.setText("Button #"+((JButton)e.getSource()).getText());
                            }
                        }
                    }
                });
                panel.add(nineButtons[y*3+x]);
            }
        }
        panel.add(label,0,1);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

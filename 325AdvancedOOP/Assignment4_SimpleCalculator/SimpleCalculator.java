import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class SimpleCalculator extends JFrame {
    private BorderLayout mainLayout = new BorderLayout();
    private GridLayout buttonsLayout = new GridLayout(6,3);
    private JPanel bodyPanel = new JPanel(mainLayout);
    private JPanel buttonPanel = new JPanel(buttonsLayout);
    private JButton[] inpuButtons = new JButton[18];

    public SimpleCalculator(){
        this.add(bodyPanel);
        bodyPanel.add(buttonPanel, BorderLayout.CENTER);
        bodyPanel.add(ioLine,BorderLayout.NORTH);
        String[] buttonText = {"1","2","3","4","5","6","7","8","9","0",".","+","-","x","/","=","CE","←"};
        for(int i = 0; i< buttonText.length; i++){
            buttonPanel.add(new JButton(buttonText[i]));
        }
    }

}

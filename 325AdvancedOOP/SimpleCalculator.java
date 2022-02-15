import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class SimpleCalculator extends JFrame {
    private BorderLayout mainLayout = new BorderLayout();
    private GridLayout buttonsLayout = new GridLayout();
    private JPanel bodyPanel = new JPanel(mainLayout);
    private JPanel buttonPanel = new JPanel(buttonsLayout);
    private JButton oneButton = new JButton("1");
    private JButton twoButton = new JButton("2");
    private JButton threeButton = new JButton("3");
    private JButton fourButton = new JButton("4");
    private JButton fiveButton = new JButton("5");
    private JButton sixButton = new JButton("6");
    private JButton sevenButton = new JButton("7");
    private JButton eightButton = new JButton("8");
    private JButton nineButton = new JButton("9");
    private JButton zeroButton = new JButton("0");
    private JButton dotButton = new JButton(".");
    private JButton plusButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JButton timesButton = new JButton("x");
    private JButton divideButton = new JButton("/");
    private JButton equalButton = new JButton("=");
    private JButton clearButton = new JButton("CE");
    private JButton backButton = new JButton("←");
    private JTextField ioLine = new JTextField("0");

    public SimpleCalculator(){
        this.add(bodyPanel);
        bodyPanel.add(buttonPanel, BorderLayout.CENTER);
        bodyPanel.add(ioLine,BorderLayout.NORTH);

    }

}

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SimpleCalculator extends JFrame {
    private GridLayout buttonLayoutTop = new GridLayout(3,4);
    private GridLayout buttonLayoutBottom = new GridLayout(2,3);

    private JPanel bodyPanel = new JPanel();
    private JPanel buttonPanelTop = new JPanel();
    private JPanel buttonPanelBottom = new JPanel();
    private JCalcButton[] inputButtons;
    private static JTextField ioLine = new JTextField("0");
    private static double previousNumber = 0;
    private static short operan;
    private static boolean newNumber = false;
    private static boolean hitEqual = true;

    private static final short ADD = 0;
    private static final short MINUS = 1;
    private static final short TIMES = 2;
    private static final short DIVIDE = 3;

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
    }

    public SimpleCalculator(){
        this.add(bodyPanel);
        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));
        bodyPanel.add(ioLine);
        bodyPanel.add(buttonPanelTop);
        bodyPanel.add(buttonPanelBottom);
        buttonPanelTop.setLayout(buttonLayoutTop);
        buttonPanelBottom.setLayout(buttonLayoutBottom);
        String[] buttonTextTop = {"1","2","3","+","4","5","6","-","7","8","9","="};
        String[] buttonTextBottom = {".","0","\u2190","x","/","CE"};
        //Buttons that need special Listeners {".","+","-","x","/",""\u2190" backspace ","CE"};
        int totalButtons = buttonTextTop.length+buttonTextBottom.length;
        inputButtons = new JCalcButton[totalButtons];
        for(int i = 0; i< buttonTextTop.length; i++){
            inputButtons[i] = new JCalcButton(buttonTextTop[i],new NumberConcatListener());
            inputButtons[i].setFont(new Font("Courier",Font.PLAIN,30));
            buttonPanelTop.add(inputButtons[i]);

        }
        for(int i = 0; i< buttonTextBottom.length; i++){
            inputButtons[buttonTextTop.length+i] = new JCalcButton(buttonTextBottom[i],new NumberConcatListener());
            inputButtons[buttonTextTop.length+i].setFont(new Font("Courier",Font.PLAIN,30));
            buttonPanelBottom.add(inputButtons[buttonTextTop.length+i]);

        }
        //seperate listeners for cleaner code
        inputButtons[3].changeActionListener(new OperanListener());
        inputButtons[7].changeActionListener(new OperanListener());
        inputButtons[15].changeActionListener(new OperanListener());
        inputButtons[16].changeActionListener(new OperanListener());
        inputButtons[11].changeActionListener(new EqualListener());
        inputButtons[12].changeActionListener(new DotConcatListener());
        inputButtons[14].changeActionListener(new BackspaceListener());
        inputButtons[17].changeActionListener(new ClearListener());
        ioLine.setEditable(false);
        this.setSize(640,480);
        ioLine.setFont(new Font("Courier", Font.BOLD,55));
        this.setTitle("Borchelt Calculator");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(SimpleCalculator.EXIT_ON_CLOSE);
    }

    public static void concatNumbers(ActionEvent e){
        ioLine.setText(ioLine.getText().concat(((JCalcButton)e.getSource()).toString()));
        newNumber = false;
    }

    public static double doOperation(){
        if(operan==ADD)
            return previousNumber+Double.valueOf(ioLine.getText());
        else if(operan==MINUS)
            return previousNumber-Double.valueOf(ioLine.getText());
        else if(operan==TIMES)
            return previousNumber*Double.valueOf(ioLine.getText());
        else{
            Double divCalc = previousNumber/Double.valueOf(ioLine.getText());
            //dividing by a floating point 0.0 will output infinity instead of a DivideByZeroException
            if(divCalc.equals(Double.POSITIVE_INFINITY) || divCalc.equals(Double.NEGATIVE_INFINITY)){
                JOptionPane.showMessageDialog(null, "You cannot divide by 0", "Div0Err", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            else
                return divCalc.doubleValue();
        }
    }

    public class NumberConcatListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(ioLine.getText().equals("0") || newNumber){
                ioLine.setText("");
            }
            concatNumbers(e);

        }

    }

    public class OperanListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JCalcButton operanButton = (JCalcButton)e.getSource();
            if(!hitEqual){
                //cleanup so the output does not have unnecessary zeros otherwise just output
                double output = doOperation();
                if(output%1.0==0){
                    ioLine.setText(String.valueOf(Math.round(output)));
                }
                else
                    ioLine.setText(String.valueOf(output));
            }
            else{
                previousNumber = Double.valueOf(ioLine.getText());
                if (operanButton.getText().equals("+")) {
                    hitEqual = false;
                    operan = ADD;
                }
                else if (operanButton.getText().equals("-")) {
                    hitEqual = false;
                    operan = MINUS;
                }
                else if (operanButton.getText().equals("x")) {
                    hitEqual = false;
                    operan = TIMES;
                }
                else if (operanButton.getText().equals("/")){
                    hitEqual = false;
                    operan = DIVIDE;
                }
                newNumber = true;
            }
        }
    }

    public class EqualListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(hitEqual){
                ioLine.setText(String.valueOf(doOperation()));
            }
            else{
                double output = doOperation();
                if(output%1.0==0){
                    ioLine.setText(String.valueOf(Math.round(output)));
                }
                else
                    ioLine.setText(String.valueOf(output));
                hitEqual = true;
            }
        }
    }
    public class DotConcatListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //a check to either have 0.# or #.# and not have multiple dots in the number
            if(ioLine.getText().equals("")){
                ioLine.setText("0");
            }
            if(!ioLine.getText().contains(".")){
                concatNumbers(e);
            }
        }
    }

    public class ClearListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            ioLine.setText("0");
            previousNumber = 0;
        }
    }
    public class BackspaceListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //deletes characters from right to left until the number is gone and defaults to 0
            String input = ioLine.getText();
            if(!(input.length()==0)){
                ioLine.setText(input.substring(0,input.length()-1));
                if(ioLine.getText().length()==0){
                    ioLine.setText("0");
                }
            }
        }

    }
}
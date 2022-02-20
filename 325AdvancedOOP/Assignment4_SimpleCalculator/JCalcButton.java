import javax.swing.JButton;

import java.awt.event.ActionListener;
public class JCalcButton extends JButton {

    public JCalcButton(String text, ActionListener al){
        super(text);
        this.addActionListener(al);
    }
    @Override
    public String toString() {
        return this.getText();
    }
    public void changeActionListener(ActionListener al){
        for(ActionListener ial: this.getActionListeners()) //ial = independent action listener
            this.removeActionListener(ial);
        this.addActionListener(al);
    }
}

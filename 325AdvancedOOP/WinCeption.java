import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinCeption {
    private JPanel panel = new JPanel();
    private JButton newWindowButton  = new JButton("Create New Window");
    private JTextArea widthTA = new JTextArea("640");
    private JTextArea heightTA = new JTextArea("480");
    private JTextArea winNameTA = new JTextArea("default title");
    private JLabel widthLabel = new JLabel("Width: ");
    private JLabel heightLabel = new JLabel("Height: ");
    private JLabel winNameLabel = new JLabel("Name: ");

    public WinCeption(int width, int height, String title){
        JFrame frame = new JFrame (title);
        frame.add(panel);
        JComponent[] allComponents = {newWindowButton,widthLabel,widthTA,heightLabel,heightTA,winNameLabel,winNameTA};
        for(JComponent c: allComponents){
            panel.add(c);
        }
        newWindowButton.addActionListener(new NewWindowListener());
        frame.setVisible(true);
        frame.setSize(width,height);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        WinCeption initialWindow = new WinCeption(640, 480, "Default 1");
    }

    public class NewWindowListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int width = Integer.valueOf(widthTA.getText());
            int height = Integer.valueOf(heightTA.getText());
            String winTitle = winNameTA.getText();
            WinCeption newWindow = new WinCeption(width,height,winTitle);
        }
    }
}

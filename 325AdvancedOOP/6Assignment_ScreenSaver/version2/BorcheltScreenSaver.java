import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BorcheltScreenSaver extends JFrame{

    public BorcheltScreenSaver(){
        int numShapes = 500;
        setLayout(null);

        //https://stackoverflow.com/a/11570414
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true);
        setVisible(true);

        Shapes shapes = new Shapes(numShapes, this.getWidth(), this.getHeight());
        setContentPane(shapes);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //https://stackoverflow.com/a/55980540
        //a way of varying speed based off of computer screen refresh rate
        int fps = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].getDisplayMode().getRefreshRate();
        setTitle("Borchelt Screen Saver");


        Timer t = new Timer(1000/fps, shapes);
        t.start();
    }
    public static void main(String[] args) {
        new BorcheltScreenSaver();

    }
}

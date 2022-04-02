import java.util.Random;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BorcheltScreenSaver extends JFrame{

    public BorcheltScreenSaver(){
        int numShapes = 50;
        setLayout(null);
        setSize(640,480);
        Shapes shapes = new Shapes(numShapes, this.getWidth(), this.getHeight());
        setContentPane(shapes);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int fps = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].getDisplayMode().getRefreshRate();
        setTitle("Borchelt Screen Saver");

        Timer t = new Timer(1000/fps, shapes);
        t.start();
    }
    public static void main(String[] args) {
        new BorcheltScreenSaver();

    }
}

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BorcheltScreenSaver extends JFrame{

    public BorcheltScreenSaver(){
        int numShapes = 10;
        setLayout(null);
        Shapes shapes = new Shapes(numShapes);
        setContentPane(shapes);
        setVisible(true);
        setSize(640,480);
        setDefaultCloseOperation(3);
        setTitle("Borchelt Screen Saver");

        Timer t = new Timer(150, shapes);
        t.start();
    }
    public static void main(String[] args) {
        new BorcheltScreenSaver();

    }
}

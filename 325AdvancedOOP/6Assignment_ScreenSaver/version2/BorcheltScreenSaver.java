import java.util.Random;

import javax.swing.JFrame;

public class BorcheltScreenSaver extends JFrame{

    public BorcheltScreenSaver(){
        setLayout(null);
        Shapes shapes = new Shapes(10);
        setContentPane(shapes);
        setVisible(true);
        setSize(640,480);
        setDefaultCloseOperation(3);
        setTitle("Borchelt Screen Saver");
    }
    public static void main(String[] args) {
        new BorcheltScreenSaver();

    }
}

import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.BorderLayout;
public class BorcheltScreenSaver{

    public static int FRAME_WIDTH = 640;
    public static int FRAME_HEIGHT = 480;
    public static Random random;
    public static AllShapes as;

    public static void main(String[] args){
        random = new Random();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setLayout(new BorderLayout());
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Borchelt Screen Saver");
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        panel.setBackground(Color.BLACK);

        as = new AllShapes(10);

        for (int i = 0; i < as.length(); i++){
            if(random.nextBoolean()){
                as.setShape(i, new RectangleComponent(random.nextInt(FRAME_WIDTH), random.nextInt(FRAME_HEIGHT), random.nextInt(100)+50, random.nextInt(100)+50));
            }
            else{
                as.setShape(i,new CircleComponent(random.nextInt(FRAME_WIDTH), random.nextInt(FRAME_HEIGHT), random.nextInt(100)+50));
            }
        }

        panel.add(as);

        class TimerListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < as.length(); i++){
                    SaverComponent sc = as.getShape(i);
                    if(sc.getX() < 0){
                        sc.setDx(random.nextInt(15));
                        sc.newColor();
                    }
                    if(sc.getY() < 0){
                        sc.setDy(random.nextInt(15));
                        sc.newColor();
                    }
                    if(sc.getX()+sc.getWidth() > frame.getWidth()){
                        sc.setDx(-1*random.nextInt(15));
                        sc.newColor();
                    }
                    if(sc.getX()+sc.getHeight() > frame.getHeight()){
                        sc.setDx(-1*random.nextInt(15));
                        sc.newColor();
                    }
                    sc.moveBy(sc.getDx(), sc.getDy());

                }

            }
        }
        ActionListener listener = new TimerListener();

        final int DELAY = 1000/as.length();

        Timer t = new Timer(DELAY, listener);
        t.start();

    }


}

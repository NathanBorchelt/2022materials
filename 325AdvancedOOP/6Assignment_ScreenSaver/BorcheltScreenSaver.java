import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Color;
public class BorcheltScreenSaver{

    public static int FRAME_WIDTH = 640;
    public static int FRAME_HEIGHT = 480;
    public static Random random;
    public static SaverComponent[] screenObjects = new SaverComponent[25];

    public static void main(String[] args){
        random = new Random();
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Borchelt Screen Saver");
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);

        for (int i = 0; i < screenObjects.length; i++){
            if(random.nextBoolean()){
                screenObjects[i] = new RectangleComponent(random.nextInt(FRAME_WIDTH), random.nextInt(FRAME_HEIGHT), random.nextInt(100)+50, random.nextInt(100)+50);
            }
            else{
                screenObjects[i] = new CircleComponent(random.nextInt(FRAME_WIDTH), random.nextInt(FRAME_HEIGHT), random.nextInt(100)+50);
            }
        }

        for(SaverComponent sc: screenObjects){
            frame.add((JComponent)sc);
        }

        class TimerListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                for(SaverComponent sc: screenObjects){
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

        final int DELAY = 1000/screenObjects.length;

        Timer t = new Timer(DELAY, listener);
        t.start();

    }


}

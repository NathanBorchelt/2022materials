import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;
/**
   This program moves the rectangle.
*/
public class RectangleMover
{
   private static final int FRAME_WIDTH = 640;
   private static final int FRAME_HEIGHT = 480;
   public static Random random;
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      random = new Random();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("An animated rectangle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      final RectangleComponent component = new RectangleComponent(200,200,25,25);
      frame.add(component);
      frame.setVisible(true);

        class TimerListener implements ActionListener{
            private int dX;
            private int dY;
            public void actionPerformed(ActionEvent event){
                if(component.getX() < 1){
                    dX = random.nextInt(10);
                    System.out.println("x<1");
                }
                if(component.getY() < 1){
                    dY = random.nextInt(10);
                    System.out.println("y<1");
                }
                if((component.getX()+component.getWidth()) > RectangleMover.FRAME_WIDTH){
                    dX = -1*random.nextInt(10);
                    System.out.println("x>width");
                }
                if((component.getY()+component.getHeight()) > RectangleMover.FRAME_HEIGHT){
                    dY = -1*random.nextInt(10);
                    System.out.println("y>height");
                }

                component.moveBy(dX, dY);
            }
        }
        ActionListener listener = new TimerListener();
        final int DELAY = 150; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
   This program moves the rectangle.
*/
public class RectangleMover
{
   private static final int FRAME_WIDTH = 640;
   private static final int FRAME_HEIGHT = 480;
   public static Random random;
   public static int dX;
   public static int dY;
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      random = new Random();
      dX = random.nextInt(10);
      dY = random.nextInt(10);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("An animated rectangle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      RectangleComponent component = new RectangleComponent(200,200,25,25);
      frame.add(component);
      frame.setVisible(true);

        class TimerListener implements ActionListener{

            public void actionPerformed(ActionEvent event){
                if(component.getX() < 1){
                    RectangleMover.dX = -RectangleMover.dX;
                    System.out.println("x<1");
                }
                else if((component.getX()+component.getWidth()) > RectangleMover.FRAME_WIDTH){
                    RectangleMover.dX = -RectangleMover.dX;
                    System.out.println("x>width");
                }
                if(component.getY() < 1){
                    RectangleMover.dY = -RectangleMover.dY;
                    System.out.println("y<1");
                }
                else if((component.getY()+component.getHeight()) > RectangleMover.FRAME_HEIGHT){
                    RectangleMover.dY = -RectangleMover.dY;
                    System.out.println("y>height");
                }

                component.moveBy(RectangleMover.dX,RectangleMover.dY);
            }
        }
        ActionListener listener = new TimerListener();
        final int DELAY = 150; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}

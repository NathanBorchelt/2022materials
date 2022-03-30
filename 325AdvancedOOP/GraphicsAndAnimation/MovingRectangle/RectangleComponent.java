import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
   This component displays a rectangle that can be moved.
*/
public class RectangleComponent extends JComponent
{
   private int width;
   private int height;
   private Rectangle box;

   /**
    *
    * @param x the x coordinate of the box in reference to the top left corner
    * @param y the x coordinate of the box in reference to the top left corner
    * @param width the width of the box, must be positive, box grows to the right
    * @param height the height of the box, must be positive, box grows downward
    */
   public RectangleComponent(int x,int y,int width,int height)
   {


        this.width = width;
        this.height = height;

        box = new Rectangle(x, y, width, height);
   }

   public int getX(){
      return box.x;
   }

   public int getY(){
      return box.y;
   }

   public int getWidth(){
       return width;
   }

   public int getHeight(){
       return height;
   }

   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.fill(box);;
   }
   /**
      Moves the rectangle by a given amount.
      @param dx the amount to move in the x-direction
      @param dy the amount to move in the y-direction
   */
   public void moveBy(int dx, int dy)
   {
      box.translate(dx, dy);
      System.out.println(box.x+","+box.y);
      repaint();
   }
}

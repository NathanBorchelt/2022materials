import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class RectangleComponent extends JComponent  implements SaverComponent{

    private Graphics2D g2;
    private int dx;
    private int dy;
    private CustomColor color;
    private int height;
    private int width;
    private Rectangle rectangle;

    public RectangleComponent(int x, int y, int width, int height){
        this.width = width;
        this.height = height;

        color = new CustomColor();
        rectangle = new Rectangle(x, y, width, height);

    }

    @Override
    public int getX() {
        return rectangle.x;
    }

    @Override
    public int getY() {
        return rectangle.y;
    }

    /**
     * @param dx the dx to set
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    /**
     * @param dy the dy to set
     */
    public void setDy(int dy) {
        this.dy = dy;
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return width;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return height;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.fill(rectangle);
        g2.draw(rectangle);

    }


    public void moveBy(int dx, int dy){
        rectangle.translate(dx, dy);
        repaint();
    }

    @Override
    public int getDx() {
        // TODO Auto-generated method stub
        return dx;
    }

    @Override
    public void newColor() {
        color = new CustomColor();
    }

    @Override
    public int getDy() {
        // TODO Auto-generated method stub
        return dy;
    }

}

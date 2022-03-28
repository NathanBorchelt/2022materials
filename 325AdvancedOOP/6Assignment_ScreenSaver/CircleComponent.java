

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class CircleComponent extends JComponent implements SaverComponent {
    private CustomColor color;

    private Graphics2D g2;
    private int dx;
    private int dy;
    private int radius;
    private int x;
    private int y;
    private Ellipse2D circle;

    public CircleComponent(int x, int y, int radius){
        this.radius = radius;
        this.x = x;
        this.y = y;
        circle = new Ellipse2D.Double(x * 1.0, y * 1.0, radius * 1.0 , radius * 1.0 );
        color = new CustomColor();

    }

    public int getX(){
        return (int) circle.getX();
    }

    public int getY(){
        return (int) circle.getY();
    }

    public int getWidth(){
        return radius;
    }
    public int getHeight(){
        return radius;
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

    public void paintComponent(Graphics g){
        g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.fill(circle);
        g2.draw(circle);
    }
    public void moveBy(int dx, int dy){
        x+=dx;
        y+=dy;
        circle.setFrame(x, y, radius, radius);

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

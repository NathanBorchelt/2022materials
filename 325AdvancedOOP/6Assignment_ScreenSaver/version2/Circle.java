import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;


public class Circle extends Ellipse2D{

    int x;
    int y;
    int diameter;
    Color color;
    int xVelo;
    int yVelo;

    /**
     * @param x the x position based off the top left corner
     * @param y the y position based off the top left corner
     * @param diameter the diameter of the circle
     */
    public Circle(int x, int y, int diameter){
        if(diameter < 0) throw new RuntimeException("Cannot have a diameter less than zero");

        this.x = x;
        this.y = y;
        this.diameter = diameter;
        color = Color.BLACK;
        xVelo = 0;
        yVelo = 0;
    }
    /**
     * @param x the x position based off the top left corner
     * @param y the y position based off the top left corner
     * @param diameter the diameter of the circle
     * @param color the color of the circle based off java.awt.Color
     */
    public Circle(int x, int y, int diameter, Color color){
        if(diameter < 0) throw new RuntimeException("Cannot have a diameter less than zero");

        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
        xVelo = 0;
        yVelo = 0;
    }
    /**
     * @param x the x position based off the top left corner
     * @param y the y position based off the top left corner
     * @param diameter the diameter of the circle
     * @param color the color of the circle based off java.awt.Color
     * @param xVelo the x velocity of the circle
     * @param yVelo the y velocity of the circle
     */
    public Circle(int x, int y, int diameter, Color color, int xVelo, int yVelo){
        if(diameter < 0) throw new RuntimeException("Cannot have a diameter less than zero");

        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
        this.xVelo = xVelo;
        this.yVelo = yVelo;
    }


    /**
     * @param x sets the x position based off the top left corner
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y sets the y position based off the top left corner
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * @param xVelo sets the x velocity with positive number causing movement to the right
     */
    public void setXVelo(int xVelo) {
        this.xVelo = xVelo;
    }

    /**
     * @param yVelo sets the y velocity with positive number causing movement to the bottom
     */
    public void setYVelo(int yVelo) {
        this.yVelo = yVelo;
    }

    /**
     *
     * @param color sets the color the shape will display in using java.awt.Color objects
     */
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    /**
     * {@inheritDoc}
     */
    public Rectangle2D getBounds2D() {
        return new Rectangle2D.Float(x, y, diameter, diameter);
    }

    @Override
    /**
     * @return the x position based off the top left corner
     */
    public double getX() {
        return x;
    }

    @Override
    /**
     * @return the y position based off the top left corner
     */
    public double getY() {
        return y;
    }

    @Override
    /**
     * @return the diameter, method exist due to interface with super classes
     */
    public double getWidth() {
        return diameter;
    }

    @Override
    /**
     * @return the diameter, method exist due to interface with super classes
     */
    public double getHeight() {
        return diameter;
    }

    /**
     * @return the diameter
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * @return the xVelo
     */
    public int getXVelo() {
        return xVelo;
    }

    /**
     * @return the yVelo
     */
    public int getYVelo() {
        return yVelo;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }


    @Override
    /**
     * @return a circle is considered empty if the diameter is zero
     */
    public boolean isEmpty() {
        return diameter != 0;
    }

    @Override
    /**
     * {@inheritDoc}
     * Only takes both width and height due to inheritance, but only uses the width to assign to the diameter
     */
    public void setFrame(double x, double y, double w, double h) {
        this.x = (int) x;
        this.y = (int) y;
        diameter = (int) w;

    }

    /**
     * This function causes the x and y positions to change by the relative velocities
     */
    public void move(){
        x += xVelo;
        y += yVelo;
    }

}

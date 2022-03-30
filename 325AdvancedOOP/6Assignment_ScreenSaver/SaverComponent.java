import java.awt.Graphics;

public interface SaverComponent{
    public void moveBy(int dx, int dy);
    public int getDx();
    public int getDy();
    public void setDx(int dx);
    public void setDy(int dy);
    public int getX();
    public int getY();
    public void newColor();
    public int getWidth();
    public int getHeight();
    public void validate();
    public void paintComponent(Graphics g);
}

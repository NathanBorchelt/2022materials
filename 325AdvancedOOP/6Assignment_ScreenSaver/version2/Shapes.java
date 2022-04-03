import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Shapes extends JPanel implements ActionListener{
    private int size;

    private Random random;

    private Circle[] circleArr;

    public Shapes(int size, int width, int height){
        setBackground(Color.BLACK);

        random = new Random();

        this.size = size;

        circleArr = new Circle[size];

        for(int i = 0; i < size; i++){
            circleArr[i] =new Circle(random.nextInt(width), random.nextInt(height), random.nextInt(50)+25, new CustomColor(), random.nextInt(30)-15, random.nextInt(30)-15);
        }



    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Circle c: circleArr){
            g2.setColor(c.getColor());
            g2.fill(c);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int screenWidth = this.getWidth();
        int screenHeight = this.getHeight();

        int x,y,diameter;
        for(int i = 0; i < size; i++){
            Circle c = circleArr[i];
            x = (int) c.getX();
            y = (int) c.getY();
            diameter = c.getDiameter();

            //left side detection
            if(x < 0){
                c.setXVelo(random.nextInt(15)+1);
                c.setColor(new CustomColor());
            }

            //top side detection
            if(y < 0){
                c.setYVelo(random.nextInt(15)+1);
                c.setColor(new CustomColor());
            }

            //right side detection
            if(x + diameter > screenWidth){
                c.setXVelo(-random.nextInt(15)+1);
                c.setColor(new CustomColor());
            }

            //bottom side detection
            if(y + diameter > screenHeight){
                c.setYVelo(-random.nextInt(15)+1);
                c.setColor(new CustomColor());
            }

            c.move();
            circleArr[i] = c;
            repaint();
        }
    }

}

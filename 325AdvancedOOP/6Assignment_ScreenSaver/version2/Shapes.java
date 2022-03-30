import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Shapes extends JPanel implements ActionListener{
    Timer timer = new Timer();

    int size;

    Random random;

    Ellipse2D[] ellipseArr;

    int[] veloArrX;
    int[] veloArrY;

    public Shapes(int size){
        setBackground(Color.BLACK);

        random = new Random();

        this.size = size;

        ellipseArr = new Ellipse2D.Double[size];
        veloArrX = new int[size];
        veloArrY = new int[size];



    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < size; i++){
            int rad = random.nextInt(100)+33;
            ellipseArr[i] = new Ellipse2D.Double(random.nextInt(this.getWidth()), random.nextInt(this.getHeight()), rad,rad);
            veloArrX[i] = random.nextInt(10)-5;
            veloArrY[i] = random.nextInt(10)-5;
        }
        for(Ellipse2D e2d : ellipseArr){
            g2.setColor(new CustomColor());
            g2.fill(e2d);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        for(int i = 0; i < ellipseArr.length; i++){
            if(ellipseArr[i].getX() < 0){
                veloArrX[i] = random.nextInt(5)+1;
            }
            else if(ellipseArr[i].getY() < 0){
                veloArrY[i] = random.nextInt(5)+1;
            }
            else if(ellipseArr[i].getX()+ellipseArr[i].getWidth() > this.getWidth()){
                veloArrX[i] = -random.nextInt(5)+1;
            }
            else if(ellipseArr[i].getX()+ellipseArr[i].getHeight() > this.getHeight()){
                veloArrY[i] = -random.nextInt(5)+1;
            }

            ellipseArr[i].setFrame(ellipseArr[i].getX()+ veloArrX[i],ellipseArr[i].getY()+ veloArrY[i],ellipseArr[i].getWidth(),ellipseArr[i].getHeight());
            repaint();
        }


    }

}

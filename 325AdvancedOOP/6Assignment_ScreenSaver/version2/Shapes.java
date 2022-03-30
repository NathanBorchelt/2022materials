import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Shapes extends JPanel implements ActionListener{
    Timer timer = new Timer();

    int size;

    Random random;

    Rectangle[] rectArr;

    int[] veloArrX;
    int[] veloArrY;

    public Shapes(int size){
        random = new Random();

        this.size = size;

        rectArr = new Rectangle[size];
        veloArrX = new int[size];
        veloArrY = new int[size];



    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < size; i++){
            g2.setColor(new CustomColor());
            rectArr[i] = new Rectangle(random.nextInt(this.getWidth()), random.nextInt(this.getHeight()), random.nextInt(100)+50, random.nextInt(100)+50);
            veloArrX[i] = random.nextInt(30)-15;
            veloArrY[i] = random.nextInt(30)-15;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        for(int i = 0; i < rectArr.length; i++){
            if(rectArr[i].getX() < 0){
                veloArrX[i] = random.nextInt(15);
            }
            if(rectArr[i].getY() < 0){
                veloArrY[i] = random.nextInt(15);
            }
            if(rectArr[i].getX()+rectArr[i].getWidth() > this.getWidth()){
                veloArrX[i] = -random.nextInt(15);
            }
            if(rectArr[i].getX()+rectArr[i].getHeight() > this.getHeight()){
                veloArrY[i] = -random.nextInt(15);
            }

            rectArr[i].translate(veloArrX[i], veloArrY[i]);
            repaint();
        }


    }

}

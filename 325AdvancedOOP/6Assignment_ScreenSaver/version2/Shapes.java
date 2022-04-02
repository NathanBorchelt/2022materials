import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Shapes extends JPanel implements ActionListener{
    private int size;

    private Random random;

    private Ellipse2D[] ellipseArr;

    private int[][] veloArr;

    private Color[] colors;

    public Shapes(int size, int width, int height){
        setBackground(Color.BLACK);

        random = new Random();

        this.size = size;

        ellipseArr = new Ellipse2D.Double[size];
        veloArr = new int[size][2];
        colors = new Color[size];

        for(int i = 0; i < size; i++){
            int rad = random.nextInt(50)+25;
            ellipseArr[i] = new Ellipse2D.Double(random.nextInt(width),random.nextInt(height), rad,rad);
            veloArr[i][0] = random.nextInt(30)-15;
            veloArr[i][1] = random.nextInt(30)-15;
            colors[i] = new CustomColor();
        }



    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < size; i++){
            g2.setColor(colors[i]);
            g2.fill(ellipseArr[i]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int screenWidth = this.getWidth();
        int screenHeight = this.getHeight();
        // TODO Auto-generated method stub
        for(int i = 0; i < ellipseArr.length; i++){

            int xPos   = (int) ellipseArr[i].getX();
            int yPos   = (int) ellipseArr[i].getY();
            int rad = (int) ellipseArr[i].getWidth();


            if(xPos < 0){
                veloArr[i][0] = random.nextInt(15)+1;
                colors[i] = new CustomColor();
            }
            else if(yPos < 0){
                veloArr[i][1] = random.nextInt(15)+1;
                colors[i] = new CustomColor();
            }
            else if(xPos + rad > screenWidth){
                veloArr[i][0] = -random.nextInt(15)-1;
                colors[i] = new CustomColor();
            }
            else if(yPos + rad > screenHeight){
                veloArr[i][1] = -random.nextInt(15)-1;
                colors[i] = new CustomColor();
            }

            ellipseArr[i].setFrame(xPos + veloArr[i][0], yPos + veloArr[i][1], rad, rad);
            repaint();
        }


    }

}

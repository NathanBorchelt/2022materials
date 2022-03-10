import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.Random;

/**
   A component that draws a chart.
*/
public class ChartComponent extends JComponent{

    public void paintComponent(Graphics g){
        Random random = new Random();
        int points = random.nextInt(100)+3;

        int[] xCords = new int[points];
        int[] yCords = new int[points];
        for(int i = 0; i < points; i++){
            xCords[i] = random.nextInt(1920);
            yCords[i] = random.nextInt(1080);
        }

        g.setColor(new Color(random.nextInt(128),random.nextInt(128),random.nextInt(128),random.nextInt(128)+128));
        g.fillPolygon(xCords,yCords,points);
        repaint();
    }
}

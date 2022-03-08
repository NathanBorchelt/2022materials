import javax.swing.JComponent;
import javax.swing.JFrame;
/**
   This program displays an editable bar chart.
*/
public class ChartViewer
{
   public static void main(String[] args)
   {
      JFrame frame=new JFrame();
      frame.setSize(400,400);
      frame.setTitle("a bar chart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JComponent component=new ChartComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}

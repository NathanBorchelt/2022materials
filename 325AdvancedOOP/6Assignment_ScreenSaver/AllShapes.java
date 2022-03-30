import javax.swing.JComponent;
import java.awt.Graphics;

public class AllShapes extends JComponent{

    private SaverComponent[] allShapes;

    public AllShapes(int numShapes){
        allShapes = new SaverComponent[numShapes];
    }

    public int length(){
        return allShapes.length;
    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        for(SaverComponent sc : allShapes)
            sc.paintComponent(g);
    }

    public void setShape(int index, SaverComponent sc){
        try{
            allShapes[index] = sc;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public SaverComponent getShape(int index){
        try{
            return allShapes[index];
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}

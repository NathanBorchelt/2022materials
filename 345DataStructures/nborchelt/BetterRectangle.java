//Nathan Borchelt
//CSC 345 Assignment 1
import java.awt.Rectangle;
public class BetterRectangle extends Rectangle{
    public static void main(String[] args) {
        BetterRectangle bbr = new BetterRectangle(5,4);
        System.out.println(bbr);
    }
    
    public BetterRectangle(int width, int height){
        super(width, height);
    }
    public double getArea(){
        return super.getWidth()*super.getHeight();
    }
    public double getPerimeter(){
        return 2*(super.getWidth()+super.getHeight());
    }
    public String toString(){
        String outString = "";
        outString = super.toString();
        outString += ("\nArea: " + String.valueOf(getArea()));
        outString += ("\nPerimeter: " + String.valueOf(getPerimeter()));
        return outString;
    }
}

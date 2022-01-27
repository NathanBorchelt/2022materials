
// A data structure based off of the Shape interface
public class Square implements Shape{
    private double side;
    public Square(double s){
        side = s;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
    public String toString() {
        return "Square of length "+side;
    };
}

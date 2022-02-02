public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle with dimensions of "+length+"x"+width;
    };
}

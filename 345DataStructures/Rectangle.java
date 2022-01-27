public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double len, double wid){
        lenght = len;
        width = wid;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(lenght*width);
    }
}

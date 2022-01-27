public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(){
        length = 3.0;
        width = 5.0;
    }

    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }

    public Rectangle(int len, int wid){
        length = len*1.0;
        width = wid*1.0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
     
    public double getPerimeter(){
        return 2*(length+width);
    }
}

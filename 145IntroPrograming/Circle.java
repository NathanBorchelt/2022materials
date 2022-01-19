
public class Circle {

    private double radius;
    
    public Circle(double r){
        radius = r;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea() +" " + c.getCircumference()+" "+c.getRadius());
    }
}

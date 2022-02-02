public class Test {
    public static void main(String[] args) {
        Shape[] s = {
            new Square(10),
            new Rectangle(10,20)
        };

        for(Shape shape: s){
            System.out.println(shape);
            System.out.println("Area of: "+ shape.getArea());
            System.out.println("Perimeter of: "+shape.getPerimeter());
            System.out.println();
        }
    }
}

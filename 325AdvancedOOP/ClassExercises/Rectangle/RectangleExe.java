public class RectangleExe {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10.0, 25.0);
        System.out.println(r1.getArea());
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        r1.setLength(20.0);
        r1.setWidth(r1.getLength());
        System.out.println(r1.getPerimeter());

        AdvancedRectangle aR1 = new AdvancedRectangle(0.0,0.0,10,15);
        System.out.println(aR1.calcCorners());

    }
}

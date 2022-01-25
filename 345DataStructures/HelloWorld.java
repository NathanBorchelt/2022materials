public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car();
        System.out.println(car);
        Car myCar = new Car("Scion", "tC", (short)2013);
        System.out.println(myCar);
        Widget w = new Widget(9682);
        System.out.println(w.getValue());
    }
}

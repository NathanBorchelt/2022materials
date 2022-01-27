public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Car car = new Car();
        System.out.println(car);

        Car myCar = new Car("Scion", "tC", (short)2013);
        System.out.println(myCar);

        Widget<String> w = new Widget<>("test");
        System.out.println(w.getValue());

        Widget<Integer> w1 = new Widget<>(9682);
        System.out.println(w1.getValue());

        Widget<Character> w2 = new Widget<>('z');
        System.out.println(w2.getValue());

        OrderedPair<Integer, Integer> oP = new OrderedPair<Integer, Integer>(3,3);
        System.out.println(oP);

        OrderedPair<Integer, Character> oP1 = new OrderedPair<>(3,'y');
        System.out.println(oP1);
    }

}

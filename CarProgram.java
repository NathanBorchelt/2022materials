//CSC 145 Assignment 5
//Nathan Borchelt
public class CarProgram {
    public static void main(String[] args) {
        
        Car toyota = new Car((short)2012,"Toyota");
        Car porsche = new Car((short)2016, "Porsche");

        System.out.println(toyota);
        System.out.println(porsche);

        System.out.println(porsche.getYear());
        System.out.println(porsche.getMake());

        toyota.setMake("Nissan");
        toyota.setYear((short)2022);

        System.out.println(toyota);
    }
}

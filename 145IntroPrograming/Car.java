//CSC 145 Assignment 5
//Nathan Borchelt
public class Car {
    private String make;
    private short year;

    public Car(short y, String m){
        year = y;
        make = m;
    }

    public String getMake() {
        return make;
    }
    public short getYear() {
        return year;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setYear(short year) {
        this.year = year;
    }

    public String toString() {
        return (year + " "+ make);
    };

}

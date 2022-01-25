public class Car {
    //properties and methods
    //properties are characteristics of an object (field/variable/member variable)
    private String make;
    private String model;
    private short year;

    public Car(){
        make = "unknown";
        model = "unknown";
        year = Short.MIN_VALUE;
    }

    public Car(String make, String model, short year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public short getYear() {
        return year;
    }
    public void setMake(String make) {
        this.make = make;
    }  
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(short year) {
        this.year = year;
    }
    public String toString() {
        return (year +" "+make+" "+ model);
    };
}

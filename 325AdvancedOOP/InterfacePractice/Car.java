public class Car implements Measurable, Comparable<Car>{
    private double value;
    public Car(double val){
        value = val;
    }
    public String toString() {return "Car valued at $"+ Double.toString(value);}
    public double getMeasure(){
        return value;
    }

    public int compareTo(Car otherCar){
        if (value > otherCar.getMeasure()) return 1;
        else if (value <  otherCar.getMeasure()) return -1;
        else return 0;
    }
}

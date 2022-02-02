public class Country implements Measurable, Comparable<Country>{
    private double debt;
    public Country(double d){
        debt = d;
    }
    public String toString() {return "Country with debt of $"+ Double.toString(debt);}
    public double getMeasure(){
        return debt;
    }

    public int compareTo(Country otherCountry){
        if (debt > otherCountry.getMeasure()) return 1;
        else if (debt <  otherCountry.getMeasure()) return -1;
        else return 0;
    }
}

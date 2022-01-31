public class Country implements Measurable{
    private double debt;
    public Country(double d){
        debt = d;
    }
    public double getMeasure(){
        return debt;
    }
}

public class BankAccount implements Measurable{
    private double balance;
    public BankAccount(double bal){
        balance = bal;
    }
    @Override
    public double getMeasure(){
        return balance;
    }
}

public class BankAccount implements Measurable, Comparable<BankAccount>{
    private double balance;
    public BankAccount(double bal){
        balance = bal;
    }
    public String toString() {
        return "Bank account with $"+Double.toString(balance);
    }
    public double getMeasure(){
        return balance;
    }
    public int compareTo(BankAccount otherBankAccount){

        if (balance > otherBankAccount.getMeasure()) return 1;
        else if (balance <  otherBankAccount.getMeasure()) return -1;
        else return 0;
    }
}

public class Runner {
    public static void main(String[] args) {
        BankAccount[] bankAccountArray = {new BankAccount(234.71), new BankAccount(2340.76), new BankAccount(934.34)};
        Car[] carArray = {new Car(29999.95), new Car(7500),new Car(134999.99)};
        Country[] countryArray = {new Country(28000000), new Country(247000), new Country(69842645)};

        System.out.println(average(bankAccountArray));
        System.out.println(average(carArray));
        System.out.println(average(countryArray));
    }
    public void printMeasure(Measurable m) {
        System.out.println(m.getMeasure());
    }
    public static double average(Measurable[] objs){
        if (objs.length == 0) return 0;
        double sum = 0;
        for (Measurable obj : objs){
            sum = sum + obj.getMeasure();
        }
        return sum / objs.length;
    }
}

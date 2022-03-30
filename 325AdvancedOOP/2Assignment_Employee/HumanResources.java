public class HumanResources {
    public static void main(String[] args) {

        Employee[] companyInc = {
            new Employee("James", 90000, "Manager"),
            new Employee("Bob", 150000, "Boss"),
            new Employee("Joe", 2500000, "Owner"),
            new Employee("John", 70000, "project leader"),
            new Employee("Shannon", 45000, "Basic employee"),
            new Employee("Mike", 40000, "basic employee")};

        System.out.println("Average Salary: $"+ average(companyInc));
        System.out.println("Highest Paid: "+largest(companyInc));

    }
    public static double average(Measurable[] measurables){
        double sum = 0;
        for(Measurable m: measurables){
            sum += m.getMeasure();
        }
        return sum/measurables.length;
    }

    public static Measurable largest(Measurable[] measurables){
        Measurable highest = new Employee();
        //generic constructor that has a pay of $0 so anyone can
        //be paid more and bocome the new highest paid
        for(Measurable m: measurables){
            if(m.getMeasure()>highest.getMeasure()){
                highest = m;
            }
        }
        return highest;
    }
}

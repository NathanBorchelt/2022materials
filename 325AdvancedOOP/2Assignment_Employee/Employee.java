public class Employee implements Measurable{
    private String name;
    private int salary;
    private String jobTitle;

    public Employee(){
        name = "John Doe";
        salary = 0;
        jobTitle = "Lackey";
    }

    public Employee(String name, int salary, String jobTitle){
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double getMeasure(){
        return salary;
    }

    public String toString() {
        String outString = ("Name: "+name);
        outString+= ("\nSalary: $"+salary);
        outString+= ("\nJob Title: "+jobTitle);
        return outString;
    };


    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }
    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

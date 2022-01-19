import java.util.Scanner;
import java.util.Random;
public class UsernameGen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();

        System.out.println("What is your first name:");
        String fName = in.nextLine();
        System.out.println("What is your last name:");
        String lName = in.nextLine();
        System.out.println("Your Username is:\t"+fName.substring(0,5)+lName.substring(0,5)+(10+randNum.nextInt(90)));

        in.close();
    }
}

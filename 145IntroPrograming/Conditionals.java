import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        
        /*int x = 1;

        /*Basic comparisons
        < less than
        <= less than or equal to
        > greater than
        >= greater than or equal to
        == equal to
        != not equal to
        /
        
        if(x<5){
            System.out.println("yay, x is less than 5");
        }
        System.out.println("The end")
        */
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = in.nextInt();
        if(age<21) System.out.println("I am sorry, you're too young.");
        else System.out.println("Come on in.");
        System.out.println("Have a great time.");
        in.close();

    }
    
}

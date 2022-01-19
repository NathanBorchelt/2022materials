import java.util.Scanner;
public class EndOfClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("hello "+ name);
        System.out.println("how old are you?");
        byte age = in.nextByte();
        System.out.println("Wow, you are old being "+age);

    }
}

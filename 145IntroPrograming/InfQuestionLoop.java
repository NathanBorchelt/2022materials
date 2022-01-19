import java.util.Scanner;
public class InfQuestionLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";

        while (!input.equals("n")) {
            System.out.println("Do you want to continue?");
            input = in.nextLine();
        }

        System.out.println("Good bye");

        in.close();

    }
}

//Nathan Borchelt
//Assignment 4
import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = "";
        int firstInt;
        int secondInt;
        char operand;
        int output;
        
        while(!input.trim().equals("quit")){
            System.out.print("Input an operation:\t");
            input = in.nextLine();
            if(input.equals("quit")) break;
            String[] inArray = input.split(" ");
            firstInt = Integer.valueOf(inArray[0].trim());
            secondInt = Integer.valueOf(inArray[2].trim());
            operand = inArray[1].trim().charAt(0);
            output = 0;
            
            if (operand == '+') output = firstInt + secondInt;
            else if (operand == '-') output = firstInt - secondInt;
            else if (operand == '*') output = firstInt * secondInt;
            else if (operand == '/') output = firstInt / secondInt;
            else if (operand == '%') output = firstInt % secondInt;
            
            System.out.println("Result:\t"+output);
        }
        in.close();
    }
}


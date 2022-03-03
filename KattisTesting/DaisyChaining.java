import java.util.Scanner;
class DaisyChaining{
    Scanner in = new Scanner(System.in);
    short numCases = in.nextInt();
    String[] numberOfSplitters;
    short  shortNumSplits;
    short avalibleOutlets;
    for(int i = 0; i < numCases; i++){
        numberOfSplitters = in.nextLine().split(" ");
        avalibleOutlets = 0;
        for(int j = 1; j < numberOfSplitters.length; j++){
            avalibleOutlets += Short.valueOf(numberOfSplitters[j]);
        }
        avalibleOutlets -= numberOfSplitters.length - 2;
        System.out.println(avalibleOutlets);
    }
}

import java.util.Scanner;
public class ZeroOneSequences {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[] binIn = in.nextLine().toCharArray();
        long time = System.currentTimeMillis();
        int swaps = 0;
        boolean changePosition = true;
        char swapChar;
        for (int i = 0; i < binIn.length-1; i++){
            for (int j = 0; j < binIn.length-i-1; j++){
                if (binIn[j] > binIn[j+1])
                {
                    char temp = binIn[j];
                    binIn[j] = binIn[j+1];
                    binIn[j+1] = temp;
                    swaps++;
                }
                if(binIn[j] == '?') swaps++;
            }
        }
        if(binIn[binIn.length-1]=='?') swaps++;
        System.out.println(swaps);
    }
}

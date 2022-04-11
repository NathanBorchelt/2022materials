import java.util.Random;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int length = 100;
        int maxLen = 10;
        //int[] testArr = new int[length];
        String[] strArray = new String[length];

        Random random = new Random();

        for(int i = 0; i < length; i++){
            String outString = "";
            int charLen = random.nextInt(maxLen)+1;
            for(int j = 0; j < charLen; j++){
                if(random.nextBoolean()){
                    outString += (char) (random.nextInt(26)+65);
                }
                else{
                    outString += (char) (random.nextInt(26)+97);
                }
            }
            strArray[i] = outString;
        }

        System.out.println(Arrays.toString(strArray));

        RadixSort.sort(strArray);

        System.out.println(Arrays.toString(strArray));
    }

    public static boolean inOrder(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if(i < max) return false;
            max = i;
        }
        return true;
    }
}

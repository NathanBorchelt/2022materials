import java.util.Random;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int length = 100;
        int[] testArr = new int[length];

        Random random = new Random();

        for(int i = 0; i < length; i++){
            testArr[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(testArr));

        int[] outArray = RadixSort.intSort(testArr);

        System.out.println(Arrays.toString(outArray));
    }
}

import java.util.Random;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int length = 10000000;
        int[] testArr = new int[length];

        Random random = new Random();

        for(int i = 0; i < length; i++){
            testArr[i] = random.nextInt(Integer.MAX_VALUE);
            //testArr[i] = random.nextInt(100);
        }
        //System.out.println(Arrays.toString(testArr));
        System.out.println(inOrder(testArr));

        System.out.println("Timer Start");
        long startTime = System.currentTimeMillis();
        RadixSort.intSort(testArr);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time: "+ ((endTime - startTime)/1000.0) + " seconds");

        //System.out.println(Arrays.toString(testArr));
        System.out.println(inOrder(testArr));
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

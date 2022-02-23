import java.util.Arrays;
import java.util.Random;

public class SortComparison {
    public static Random random = new Random();
    public static void main(String[] args) {
        //long unixTime = System.currentTimeMillis()
        long[] timeTaken = new long[15];

        Integer[] intArray = new Integer[2048];
        int outIndex = 0;
        long unixTime = System.currentTimeMillis();
        for(int i = 2048; i < 32769; i*=2){
            arrayReset(intArray, i);
            randomArray(intArray);
            unixTime = System.currentTimeMillis();
            Sorting.selectionSort(intArray);
            timeTaken[outIndex] = System.currentTimeMillis() - unixTime;
            outIndex++;

            arrayReset(intArray, i);
            randomArray(intArray);
            unixTime = System.currentTimeMillis();
            Sorting.insertionSort(intArray);
            timeTaken[outIndex] = System.currentTimeMillis() - unixTime;
            outIndex++;

            arrayReset(intArray, i);
            randomArray(intArray);
            unixTime = System.currentTimeMillis();
            Sorting.bubbleSort(intArray);
            timeTaken[outIndex] = System.currentTimeMillis() - unixTime;
            outIndex++;

        }
        System.out.printf("%-7s\t%-11s\t%-11s\t%-11s", "n","Selection","Insertion","Bubble");
        System.out.println();
        for(int i = 0; i<50; i++){
            System.out.print("=");
        }
        System.out.println();
        outIndex = 0;
        for(int i = 2048; i < 32769; i*=2){
            System.out.printf("%-7d\t%-11d\t%-11d\t%-11d", i,timeTaken[outIndex],timeTaken[outIndex+1],timeTaken[outIndex+2]);
            outIndex+=3;
            System.out.println();
        }
    }

    public static void arrayReset(Integer[] objArray, int length){
        objArray = null;
        objArray = new Integer[length];
    }

    public static void randomArray(Integer[] objArray){
        for(int i = 0; i < objArray.length; i++){
            objArray[i] = random.nextInt();
        }
    }
}

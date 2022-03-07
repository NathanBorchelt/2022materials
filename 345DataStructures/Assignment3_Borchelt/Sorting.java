import java.net.SocketTimeoutException;
import java.util.Arrays;

//Nathan Borchelt
//Assignment 3
public class Sorting {

    //all algorithms taken from GeeksForGeeks then modified to take generic data types.

    //https://www.geeksforgeeks.org/selection-sort/
    public static <T extends Comparable<T>> void selectionSort(T[]  objArray){
        int n = objArray.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (objArray[j].compareTo(objArray[min_idx])<0)
                    min_idx = j;
            }
            T temp = objArray[min_idx];
            objArray[min_idx] = objArray[i];
            objArray[i] = temp;
        }
    }

    //https://www.geeksforgeeks.org/insertion-sort/
    public static <T extends Comparable<T>> void insertionSort(T[] objArray){
        int n = objArray.length;
        for (int i = 1; i < n; ++i) {
            T key = objArray[i];
            int j = i - 1;
            while (j >= 0 && objArray[j].compareTo(key) > 0) {
                objArray[j + 1] = objArray[j];
                j = j - 1;
            }
            objArray[j + 1] = key;
        }
    }

    //https://www.geeksforgeeks.org/selection-sort/
    public static <T extends Comparable<T>> void bubbleSort(T[] objArray){
        int n = objArray.length;
        boolean sorted;
        for (int i = 0; i < n-1; i++){
            sorted = true;
            for (int j = 0; j < n-i-1; j++)
                if (objArray[j].compareTo(objArray[j+1])>0)
                {
                    T temp = objArray[j];
                    objArray[j] = objArray[j+1];
                    objArray[j+1] = temp;
                    sorted = false;
                }
            if(sorted) break;
        }
    }
     //https://www.geeksforgeeks.org/selection-sort/
     public static void selectionSort(int[]  intArray){
        int n = intArray.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (intArray[j]<intArray[min_idx])
                    min_idx = j;
            }
            int temp = intArray[min_idx];
            intArray[min_idx] = intArray[i];
            intArray[i] = temp;
        }
    }

    //https://www.geeksforgeeks.org/insertion-sort/
    public static void insertionSort(int[] intArray){
        int n = intArray.length;
        for (int i = 1; i < n; ++i) {
            int key = intArray[i];
            int j = i - 1;
            while (j >= 0 && intArray[j]>key) {
                intArray[j + 1] = intArray[j];
                j = j - 1;
            }
            intArray[j + 1] = key;
        }
    }

    //https://www.geeksforgeeks.org/selection-sort/
    public static void bubbleSort(int[] intArray){
        int n = intArray.length;
        boolean sorted;
        for (int i = 0; i < n-1; i++){
            sorted = true;
            for (int j = 0; j < n-i-1; j++)
                if (intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                    sorted = false;
                }
                if(sorted) break;
            }
    }
}

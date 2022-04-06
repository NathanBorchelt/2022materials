import java.util.ArrayList;
public class RadixSort {
    public static int[] intSort(int[] arrayIn){
        ArrayList<Integer> array0 = new ArrayList<>();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        ArrayList<Integer> array4 = new ArrayList<>();
        ArrayList<Integer> array5 = new ArrayList<>();
        ArrayList<Integer> array6 = new ArrayList<>();
        ArrayList<Integer> array7 = new ArrayList<>();
        ArrayList<Integer> array8 = new ArrayList<>();
        ArrayList<Integer> array9 = new ArrayList<>();
        Integer maxInt = Integer.MIN_VALUE;
        for (int integer : arrayIn) {
            if(integer > maxInt) maxInt = integer;
        }

        byte charLen = maxInt.toString().length();
    }
}

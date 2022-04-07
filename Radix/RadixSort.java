import java.util.LinkedList;
public class RadixSort {
    public static void intSort(int[] arrayIn){
        LinkedList<LinkedList<Integer>> allArrays = new LinkedList<>();
        LinkedList<Integer> array0 = new LinkedList<>();
        LinkedList<Integer> array1 = new LinkedList<>();
        LinkedList<Integer> array2 = new LinkedList<>();
        LinkedList<Integer> array3 = new LinkedList<>();
        LinkedList<Integer> array4 = new LinkedList<>();
        LinkedList<Integer> array5 = new LinkedList<>();
        LinkedList<Integer> array6 = new LinkedList<>();
        LinkedList<Integer> array7 = new LinkedList<>();
        LinkedList<Integer> array8 = new LinkedList<>();
        LinkedList<Integer> array9 = new LinkedList<>();

        allArrays.add(array0);
        allArrays.add(array1);
        allArrays.add(array2);
        allArrays.add(array3);
        allArrays.add(array4);
        allArrays.add(array5);
        allArrays.add(array6);
        allArrays.add(array7);
        allArrays.add(array8);
        allArrays.add(array9);

        int mixCounter = 0;

        Integer maxInt = Integer.MIN_VALUE;
        for (int integer : arrayIn) {
            if(integer > maxInt) maxInt = integer;
        }

        byte charLen = (byte) maxInt.toString().length();



        for (byte m = 0; m < charLen; m++){
            for(int i = 0; i < arrayIn.length; i++){
                String sInt = String.format("%0"+charLen+"d", arrayIn[i]);
                switch(sInt.charAt(sInt.length() - m - 1)){
                    case '0':
                        array0.add(arrayIn[i]);
                        break;
                    case '1':
                        array1.add(arrayIn[i]);
                        break;
                    case '2':
                        array2.add(arrayIn[i]);
                        break;
                    case '3':
                        array3.add(arrayIn[i]);
                        break;
                    case '4':
                        array4.add(arrayIn[i]);
                        break;
                    case '5':
                        array5.add(arrayIn[i]);
                        break;
                    case '6':
                        array6.add(arrayIn[i]);
                        break;
                    case '7':
                        array7.add(arrayIn[i]);
                        break;
                    case '8':
                        array8.add(arrayIn[i]);
                        break;
                    case '9':
                        array9.add(arrayIn[i]);
                        break;

                }
            }

            mixCounter = 0;

            //an = array number (ie array0, array1, ...array9)


            for(LinkedList<Integer> nArray : allArrays){
                for (int n : nArray) {
                    arrayIn[mixCounter] = n;
                    mixCounter++;
                }
                nArray.clear();
            }
        }
    }
}

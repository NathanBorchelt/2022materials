import java.util.ArrayList;
public class RadixSort {
    public static int[] intSort(int[] arrayIn){
        ArrayList<ArrayList<Integer>> allArrays = new ArrayList<>();
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
                String sInt = String.format("%"+charLen+"s", arrayIn[i]);
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

            int numArrays = allArrays.size();
            for(int an = 0; an < numArrays; an++){
                int arrayNSize = allArrays.get(an).size();
                for(int ani = 0; ani < arrayNSize; ani++){
                    arrayIn[mixCounter] = allArrays.get(an).get(ani);
                    mixCounter++;
                }
            }
        }

        int[] outArray = new int[arrayIn.length];

        mixCounter = 0;

        for(ArrayList<Integer> ali : allArrays){
            for(int i : ali){
                outArray[mixCounter] = i;
                ++mixCounter;
            }
        }

        return outArray;
    }
}

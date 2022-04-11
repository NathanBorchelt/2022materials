import java.util.LinkedList;
public class RadixSort {
    public static void sort(int[] arrayIn){
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
                switch(sInt.charAt(charLen - m - 1)){
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

    public static void sort(String[] arrayIn){
        LinkedList<LinkedList<String>> alphabetList = new LinkedList<>();

        LinkedList<String> letterPadding = new LinkedList<>();
        LinkedList<String> letterA = new LinkedList<>();
        LinkedList<String> letterB = new LinkedList<>();
        LinkedList<String> letterC = new LinkedList<>();
        LinkedList<String> letterD = new LinkedList<>();
        LinkedList<String> letterE = new LinkedList<>();
        LinkedList<String> letterF = new LinkedList<>();
        LinkedList<String> letterG = new LinkedList<>();
        LinkedList<String> letterH = new LinkedList<>();
        LinkedList<String> letterI = new LinkedList<>();
        LinkedList<String> letterJ = new LinkedList<>();
        LinkedList<String> letterK = new LinkedList<>();
        LinkedList<String> letterL = new LinkedList<>();
        LinkedList<String> letterM = new LinkedList<>();
        LinkedList<String> letterN = new LinkedList<>();
        LinkedList<String> letterO = new LinkedList<>();
        LinkedList<String> letterP = new LinkedList<>();
        LinkedList<String> letterQ = new LinkedList<>();
        LinkedList<String> letterR = new LinkedList<>();
        LinkedList<String> letterS = new LinkedList<>();
        LinkedList<String> letterT = new LinkedList<>();
        LinkedList<String> letterU = new LinkedList<>();
        LinkedList<String> letterV = new LinkedList<>();
        LinkedList<String> letterW = new LinkedList<>();
        LinkedList<String> letterX = new LinkedList<>();
        LinkedList<String> letterY = new LinkedList<>();
        LinkedList<String> letterZ = new LinkedList<>();

        alphabetList.add(letterPadding);
        alphabetList.add(letterA);
        alphabetList.add(letterB);
        alphabetList.add(letterC);
        alphabetList.add(letterD);
        alphabetList.add(letterE);
        alphabetList.add(letterF);
        alphabetList.add(letterG);
        alphabetList.add(letterH);
        alphabetList.add(letterI);
        alphabetList.add(letterJ);
        alphabetList.add(letterK);
        alphabetList.add(letterL);
        alphabetList.add(letterM);
        alphabetList.add(letterN);
        alphabetList.add(letterO);
        alphabetList.add(letterP);
        alphabetList.add(letterQ);
        alphabetList.add(letterR);
        alphabetList.add(letterS);
        alphabetList.add(letterT);
        alphabetList.add(letterU);
        alphabetList.add(letterV);
        alphabetList.add(letterW);
        alphabetList.add(letterX);
        alphabetList.add(letterY);
        alphabetList.add(letterZ);

        short maxLen = 0;
        for (String s : arrayIn) {
            short len = (short) s.length();
            if(len > maxLen) maxLen = len;
        }

        int mixCounter = 0;

        for(short m = 0; m < maxLen; m++){
            for(int n = 0; n < arrayIn.length; n++){
                String checkStr = String.format("%-"+maxLen+"s", arrayIn[n]);
                char checkLtr = checkStr.charAt(maxLen - m - 1);
                switch(checkLtr){
                    case ' ':
                        letterPadding.add(checkStr);
                        break;
                    case 'a':
                    case 'A':
                        letterA.add(arrayIn[n]);
                        break;
                    case 'b':
                    case 'B':
                        letterB.add(arrayIn[n]);
                        break;
                    case 'c':
                    case 'C':
                        letterC.add(arrayIn[n]);
                        break;
                    case 'd':
                    case 'D':
                        letterD.add(arrayIn[n]);
                        break;
                    case 'e':
                    case 'E':
                        letterE.add(arrayIn[n]);
                        break;
                    case 'f':
                    case 'F':
                        letterF.add(arrayIn[n]);
                        break;
                    case 'g':
                    case 'G':
                        letterG.add(arrayIn[n]);
                        break;
                    case 'h':
                    case 'H':
                        letterH.add(arrayIn[n]);
                        break;
                    case 'i':
                    case 'I':
                        letterI.add(arrayIn[n]);
                        break;
                    case 'j':
                    case 'J':
                        letterJ.add(arrayIn[n]);
                        break;
                    case 'k':
                    case 'K':
                        letterK.add(arrayIn[n]);
                        break;
                    case 'l':
                    case 'L':
                        letterL.add(arrayIn[n]);
                        break;
                    case 'm':
                    case 'M':
                        letterM.add(arrayIn[n]);
                        break;
                    case 'n':
                    case 'N':
                        letterN.add(arrayIn[n]);
                        break;
                    case 'o':
                    case 'O':
                        letterO.add(arrayIn[n]);
                        break;
                    case 'p':
                    case 'P':
                        letterP.add(arrayIn[n]);
                        break;
                    case 'q':
                    case 'Q':
                        letterQ.add(arrayIn[n]);
                        break;
                    case 'r':
                    case 'R':
                        letterR.add(arrayIn[n]);
                        break;
                    case 's':
                    case 'S':
                        letterS.add(arrayIn[n]);
                        break;
                    case 't':
                    case 'T':
                        letterT.add(arrayIn[n]);
                        break;
                    case 'u':
                    case 'U':
                        letterU.add(arrayIn[n]);
                        break;
                    case 'v':
                    case 'V':
                        letterV.add(arrayIn[n]);
                        break;
                    case 'w':
                    case 'W':
                        letterW.add(arrayIn[n]);
                        break;
                    case 'x':
                    case 'X':
                        letterX.add(arrayIn[n]);
                        break;
                    case 'y':
                    case 'Y':
                        letterY.add(arrayIn[n]);
                        break;
                    case 'z':
                    case 'Z':
                        letterZ.add(arrayIn[n]);
                        break;
                }
            }

            mixCounter = 0;

                for(LinkedList<String> sLL : alphabetList){
                    for(String s : sLL){
                        arrayIn[mixCounter] = s.trim();
                        mixCounter++;
                    }
                    sLL.clear();
                }
        }

    }
}

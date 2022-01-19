import java.util.Arrays;
public class BorcheltArrays {
    
    public static void main(String[] args) {

        int[] testIntArr = {10,2,1,99,-5,82,69,42,0,-20};
        System.out.println(min(testIntArr));

        char[] testCharArr = {'a','b','c','d','e','f','g'};
        printReverse(testCharArr);

        String[] testStringArr = {"Rocking","around","the","Christmas","Tree"};
        System.out.println(find("the", testStringArr));
        System.out.println(find("Merry",testStringArr));
        
        double[] testDoubleArr = {.5 , .01 , 2.5 , 1.1 , 10.0 , 33.3};
        System.out.println(Arrays.toString(testDoubleArr));
        square(testDoubleArr);
        System.out.println(Arrays.toString(testDoubleArr));
    }
    
    public static int min(int[] intArr){
        int lowestInt = Integer.MAX_VALUE;
        for(int i : intArr){
            lowestInt = Integer.min(lowestInt, i);
        }
        return lowestInt;
    }

    public static void printReverse(char[] charArr){
        System.out.print("[ ");
        for(int i = charArr.length-1; i >0; i--){
            System.out.print(Character.toString(charArr[i])+", ");
        }
        System.out.print(charArr[0]);
        System.out.println(" ]");
    }

    public static int find(String finding, String[] source){
        for(int i = 0; i<source.length; i++){
            if(source[i].equals(finding)){
                return i;
            }
        }
        return -1;
    }
    public static void square(double[] doubleArr){
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.pow(doubleArr[i],2);
        }
    }
}

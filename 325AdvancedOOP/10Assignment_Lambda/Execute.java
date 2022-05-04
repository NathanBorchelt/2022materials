//Nathan Borchelt
//Assignment 10
import java.util.Arrays;
public class Execute {
    public static void main(String[] args) {
        AddOne aO = numA -> {
            return ++numA;
        };

        AddInts aIs = (numA, numB) -> {
            return numA + numB;
        };

        Reverse rev = list -> {
            int[] result = new int[list.length];
            for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
                result[j] = list[i];
            }
            return result;
        };

        MinFunction min = (num1,num2) -> {
            if(num1 < num2) return num1;
            return num2;
        };

        CountVowels cV = str -> {
            str = str.toLowerCase();
            int count = 0;
            char[] vowels = new char[]{'a','e','i','o','u'};
            for (char c : str.toCharArray()){
                for(char v : vowels){
                    if (c == v) count++;
                }
            }
            if(count == 0 && str.contains("y")) count++;

            return count;
        };

        System.out.println("5++: "+aO.addOne(5));
        System.out.println("5+6: "+aIs.addInts(5,6));
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5})+"\t"+Arrays.toString(rev.reverse(new int[]{1,2,3,4,5})));
        System.out.println("(5,6): "+min.minFunction(5,6)+"\t(6,4): "+min.minFunction(6,4));
        System.out.println("Hello: "+cV.countVowels("Hello"));
        System.out.println("Fly: "+cV.countVowels("fly"));
    }
}

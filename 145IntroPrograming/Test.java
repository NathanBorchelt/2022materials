import java.util.Arrays;
import java.util.Scanner;
public class Test {


   public static void main(String [] args){
      try{
          System.out.println(devide(5000, 0));
      }
      catch(Exception e){
          System.err.println(e.getMessage());
      }
   }
    public static double devide(double numer, double denom){
        if(denom == 0.){
            throw new ArithmeticException("Cannot devide by Zero");
        }
        return numer/denom;
    }
}

/*
    public static double average(int[] input){
        double arrAverage=0;
        for(int i : input)
            arrAverage += i;
        return arrAverage/input.length;
    }

    public static double average(double[] input){
        double arrAverage=0;
        for(int i : input)
            arrAverage += i;
        return arrAverage/input.length;
    }

    public static double max(double[] inputArr){
        double maxVal = inputArr[0];
        for(double d : inputArr){
            if (d > maxVal) maxVal=d;
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] inArr = {1,2,3,4,5};
        System.out.println(average(inArr));

    }

    public static void printDuplicates(char[] dChars){
        String outString = "";
        for(char c : dChars){
            outString += c+' '+c;
        }
        System.out.println(outString);
    public static int[] triple(int[] intArr){
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = intArr[i]*3;
        }
        return intArr;
    }
}
*/
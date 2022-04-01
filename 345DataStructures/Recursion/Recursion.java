 public class Recursion {

    public static long factorial(long n){
        if(n > 0){
            return n * factorial(n-1);
        }
        else
            return 1;
    }

    public static long factorialI(long n){
        long result = 1;
        for(long i = n; i > 0; i--){
            result *= i;
        }
        return result;
    }

    public static long pow(long base, long exponent){
        if(exponent > 0){
            return base * pow(base , exponent-1);
        }
        else{
            return 1;
        }
    }

    public static long powI(long base, long exponent){
        long result = 1;
        for(long i = exponent; i>0; i--){
            result *= base;
        }
        return result;
    }

    public static void countDown(int n){
        if(n != 0){
            System.out.print(n + ", ");
            countDown(n-1);
        }
        else{
            System.out.println("Blast off!");
        }
    }

    public static void printReverse(String s){
        if(s.isEmpty()){
            System.out.println();
        }
        else{
            System.out.print(s.charAt(s.length()-1));
            printReverse(s.substring(0,s.length()-1));
        }
    }

    public static boolean isPalindrome(String s){
        if(s.length() < 2) return true;
        else if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        else return isPalindrome(s.substring(1, s.length()-1));
    }

    public static int count(int[] intArr){
        return count(0, intArr);
    }

    private static int count(int index, int[] intArr){
        try{
            int indexp1 = intArr[index+1];
        }
        catch(Exception e){
            try{
                int indexNoObject = intArr[index];
            }
            catch(Exception ex){
                return index;
            }
            return ++index;
        }
        return count(++index,intArr);
    }
}

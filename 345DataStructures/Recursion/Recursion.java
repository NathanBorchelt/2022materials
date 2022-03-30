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
}

import javax.management.RuntimeErrorException;

public class Recursion_nborchelt {
    public static int pow(int x, int y){
        if(y == 0) return 1;

        else if(y < 0) throw new RuntimeException("Cannot do negative powers");

        return x * pow(x,y-1);
    }

   public static double fib(int n){
        if(n < 0) throw new RuntimeException("n must be a positive integer (n >= 1)");
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static double add(double[] doubArr){
        if(doubArr.length == 0) throw new RuntimeException("Cannot add on empty array");

        return add(0,doubArr);
    }

    private static double add(int index, double[] doubArr){
        if(index == doubArr.length) return 0;
        return doubArr[index] + add(++index, doubArr);
    }

}

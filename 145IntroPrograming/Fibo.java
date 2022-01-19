public class Fibo {
    public static void main(String[] args) {
        int times = 50;
        int numLower = 0;
        int numLow = 1;
        int numHigh = 1;

        for (int i = 0; i < times-2; i++){
            numLower = numLow;
            numLow = numHigh;
            numHigh = fibo(numLower,numLow);
            
            System.out.println(numLower + " " + numLow);
        }
        System.out.println(numHigh);
    }

    public static int fibo(int numLowR, int numHighR) {
        return numLowR+numHighR;
    }
}

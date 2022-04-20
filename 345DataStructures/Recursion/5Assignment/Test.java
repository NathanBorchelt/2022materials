public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <=50; i++){
            long start = System.currentTimeMillis();
            System.out.println(Recursion_nborchelt.fib(i));
            System.out.println("/\\ "+i);
            System.out.println((System.currentTimeMillis() - start)/1000.0);
        }
    }
}

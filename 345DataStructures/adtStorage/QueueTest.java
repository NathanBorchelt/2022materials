public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> test = new LinkedQueue<>();

        for(int i = 0; i < 10; i++){
            test.push(i);
        }
        System.out.println(test);
        for(int i = 0; i < 9; i++){
            test.pop();
            System.out.println(test);
        }
        test.pop();
        System.out.println(test);

    }
}

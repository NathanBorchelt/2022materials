public class NoSizeTest {
     public static void main(String[] args) {

        LinkedStack_nborchelt<Integer> test = new LinkedStack_nborchelt<>();

        for(int i = 0; i <10; i++){
            test.push(i);
        }

        System.out.println(test.peek());
        System.out.println(test);
        System.out.println(test.getSize());
    }
}

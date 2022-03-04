public class StackTesting {
    public static void main(String[] args) {
        LinkedStack<Integer> lnkStk = new  LinkedStack<>();

        for (int i = 0; i < 10; i++){
            lnkStk.push(i);
        }

        System.out.println(lnkStk);
    }
}

public class StackTesting {
    public static void main(String[] args) {
        ArrayStack<Integer> intStack = new ArrayStack<>();

        for (int i = 0; i <30; i++){
            intStack.push(i);
        }
        System.out.println(intStack.peek());

        intStack.pop();
        System.out.println(intStack.peek());
        System.out.println(intStack.takeOut());

        System.out.println(intStack);

        ArrayStack<Integer> intStack2 = new ArrayStack<>();
        System.out.println(intStack2);
    }
}

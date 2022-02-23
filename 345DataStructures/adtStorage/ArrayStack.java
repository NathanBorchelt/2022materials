public class ArrayStack<T> implements Stack<T> {
    private T[] values;
    private int count;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        values = (T[])(new Object[10]);
        count = 0;
    }

    public void push(T value){

    }
    public void pop(){

    }
    public T peak(){

    }
    public int getSize(){

    }
    public boolean isEmpty(){

    }
}

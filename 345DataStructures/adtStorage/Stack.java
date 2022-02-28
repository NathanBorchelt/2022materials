public interface Stack<T> {
    void push(T value);
    void pop();
    T peek();
    int getSize();
    boolean isEmpty();
    T takeOut();

}

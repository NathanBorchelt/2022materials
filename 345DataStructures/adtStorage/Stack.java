public interface Stack<T> {
    void push(T value);
    void pop();
    T peak();
    int size();
    boolean isEmpty();

}

public interface Queue<T> {
    public void push(T value);
    public void pop();
    public T peek();
    public int size();
    public boolean isEmpty();
}

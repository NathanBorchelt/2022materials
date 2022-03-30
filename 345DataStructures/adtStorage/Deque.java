public interface Deque<T> {
    public void pushBack(T value);
    public void pushFront(T value);
    public void popBack();
    public void popFront();
    public T peekFront();
    public T peekBack();
    public int size();
    public boolean isEmpty();
}

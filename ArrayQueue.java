public class ArrayQueue<T> implements Queue<T>{
    private itn size;
    T[] queue;
    private int front;
    private int back;

    public void push(T value){
        //modulous math
        if(size == queue.length){
            expandCapacity();
        }
        queue[back] = value;
        back = (back+1)%queue.length;
        size++;
    }
    public void pop(){
        //modulous math
        if(count == 0){
            throw new RuntimeException("Cannot Pop Empty Queue");
        }
        T result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;

    }
    public T peek(){
        if(count == 0){
            throw new RuntimeException("Cannot Peek Empty Queue");
        }
        return queue[front];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    @Override
    public String toString() {
        //modulus math
    }
}

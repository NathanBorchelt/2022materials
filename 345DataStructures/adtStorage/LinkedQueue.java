public class LinkedQueue<T> implements Queue<T> {

    private Node<T> back;
    private Node<T> front;
    private int size;

    public LinkedQueue(){
        front = null;
        back = null;
        size = 0;
    }

    public void push(T value){
        Node<T> newNode = new Node<>(value);
        if(back!=null)
            back.setNext(newNode);
        else
            front = newNode;
        back = newNode;
        size++;
    }
    public void pop(){
        if(size == 0)
            throw new Exception("Cannot Pop Empty Queue");
    }
    public T peek(){
        if(size == 0)
            throw new Exception("Cannot Peek Empty Queue");
        return front.getValue();
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    @Override
    public String toString() {
        String outString = "[ ";
        Node<T> current = front;
        while(!(current.getNext().equals(back)) && head!=null){
            outString += current.getValue() + ", ";
            current = current.getNext();
        }
        outString += back.getValue() + " ]";
        return outString;
    }
}

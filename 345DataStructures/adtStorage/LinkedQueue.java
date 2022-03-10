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
            throw new RuntimeException("Cannot Pop Empty Queue");
        if(size==1)
            back=null;
        front = front.getNext();
        size--;

    }
    public T peek(){
        if(size == 0)
            throw new RuntimeException("Cannot Peek Empty Queue");
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
        while(front != null && (current.getNext()!=null)){
            outString += current.getValue() + ", ";
            current = current.getNext();
        }
        outString += (back!=null ? back.getValue():"") + " ]";
        return outString;
    }
}

public class LinkedStack<T> implements Stack<T> {

    private int size;
    private Node<T> top;

    public LinkedStack(){
        size = 0;
        top = null;
    }

    public void push(T value){
        top = new Node<T>(value,top);
        size++;
    }

    public void pop(){
        if(top == null) throw new RuntimeException("Cannot Pop Empty Stack");

        top = top.getNext();
        size--;

    }

    public T peek(){
        if(top == null) throw new RuntimeException("Cannot Peek Empty Stack");

        return top.getValue();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public T takeOut(){

        if(top == null) throw new RuntimeException("Cannot Take From Empty Stack");

        Node<T> oldTop = top;
        top = top.getNext();
        size--;
        return oldTop.getValue();
    }

    public String toString() {
        String outString = "[";
        Node<T> currentNode = top;
        while(currentNode.getNext() != null){
            outString += currentNode.getValue() + ", ";
            currentNode = currentNode.getNext();
        }
        outString += currentNode.getValue() + "]";
        return outString;
    }
}

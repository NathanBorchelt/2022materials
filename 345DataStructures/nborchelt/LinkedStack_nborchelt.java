//Assignment 4
//Nathan Borchelt

/**
 * With Size Property
 *      push():     O(3) = O(1)
 *      pop():      O(4) = O(1)
 *      peek():     O(5) = O(1)
 *      size():     O(1) = O(1)
 *      isEmpty():  O(2) = O(1)
 *
 * Without Size Property
 *      push():     O(2) = O(1)
 *      pop():      O(4) = O(1)
 *      peek():     O(4) = O(1)
 *      size():     O(3(n+3)+2) = O(3n+11) = O(n)
 *      isEmpty():  O(2) = O(1)
 *
 */

public class LinkedStack_nborchelt<T> implements Stack<T> {

    private Node<T> top;

    public LinkedStack_nborchelt(){
        top = null;
    }

    public void push(T value){
        top = new Node<T>(value,top);
    }

    public void pop(){
        if(top == null) throw new RuntimeException("Cannot Pop Empty Stack");
        top = top.getNext();

    }

    public T peek(){
        if(top == null) throw new RuntimeException("Cannot Peek Empty Stack");

        return top.getValue();
    }

    public int getSize(){
        return getSize(top, 0);
    }

    private int getSize(Node<T> current,int s){
        if(current != null){
            s++;
            return(getSize(current.getNext(),s));
        }
        return s;
    }

    public boolean isEmpty(){
        return (top == null);
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

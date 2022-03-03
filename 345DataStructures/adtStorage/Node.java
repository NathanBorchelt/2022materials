public class Node<T> {

    private T value;
    private Node<T> next;

    /**
     *
     * @param value value of the object
     */
    public Node(T value){
        this.value = value;
        next = null;
    }


    /**
     *
     * @param value value of the object
     * @param next node of the following object;
     */
    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }

    /**
     * @return the next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * @return the value of the current node
     */
    public T getValue() {
        return value;
    }

   /**
    * @param next the next node to set
    */
   public void setNext(Node<T> next) {
       this.next = next;
   }
}

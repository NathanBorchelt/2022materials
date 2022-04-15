public class BinaryNode<E extends Comparable>{

    private E value;
    private BinaryNode<E> leftNode = null;
    private BinaryNode<E> rightNode = null;

    public BinaryNode(E value){
        this.value = value;
    }

    /**
     * @return the value of type E
     */
    public E getValue() {
        return value;
    }

    /**
     * @return the left node of type E
     */
    public BinaryNode<E> getLeftNode() {
        return leftNode;
    }

    /**
     * @return the right node of type E
     */
    public BinaryNode<E> getRightNode() {
        return rightNode;
    }

    /**
     * @param value the value of the node on the left
     */
    public void setLeftNode(E value) {
        this.leftNode = new BinaryNode(value);
    }

    /**
     * @param node a node that allows for the sifting or mixing of trees
     */
    public void setLeftNode(BinaryNode<E> node){
        this.leftNode = node;
    }

    /**
     * @param node a node that allows for the sifting or mixing of trees
     */
    public void setRightNode(BinaryNode<E> node){
        this.rightNode = node;
    }

    /**
     * @param value the value of the node on the right
     */
    public void setRightNode(E value) {
        this.rightNode = new BinaryNode(value);
    }

    /**
     * @return true if the node does not have a left nor a right node otherwise false
     */
    public boolean isLeaf(){
        return (leftNode == null && rightNode == null);
    }

    /**
     * @return true if the node has a left or a right node otherwise false
     */
    public boolean isInternal(){
        return (leftNode != null || rightNode != null);
    }

    /**
     * @return true if the left node is not null, false if it is null
     */
    public boolean hasLeftNode(){
        return (leftNode != null);
    }

    /**
     * @return true if the right node is not null, false if it is null
     */
    public boolean hasRightNode(){
        return (rightNode != null);
    }


}

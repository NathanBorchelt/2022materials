public class BinaryTree<E extends Comparable>{
    private BinaryNode<E> root;
    private int size;

    public BinaryTree(E rootValue){
        root = new BinaryNode(rootValue);
        size = 1;
    }

    public boolean contains(E value){
        if(root.getValue().equals(value)){
            return true;
        }

        boolean result;

        if(root.hasRightNode() && root.getValue().compareTo(value) >= 0){
            return contains(root.getRightNode(), value);
        }
        else if(root.hasLeftNode() && root.getValue().compareTo(value) < 0){
            return contains(root.getLeftNode(), value);
        }
        return false;

    }
    private boolean contains(BinaryNode<E> node, E value){
        if(root.getValue().equals(value)){
            return true;
        }

        boolean result;

        if(root.hasRightNode() && root.getValue().compareTo(value) >= 0){
            return contains(root.getRightNode(), value);
        }
        else if(root.hasLeftNode() && root.getValue().compareTo(value) < 0){
            return contains(root.getLeftNode(), value);
        }
        return false;
    }

    public void add(E value){
        size++;
        if(root.hasRightNode() && root.getValue().compareTo(value) >= 0){
            add(value, root.getRightNode());
        }
        else{
            if(root.getValue().compareTo(value) >= 0){
                root.setRightNode(value);
            }
        }

        if(root.hasLeftNode() && root.getValue().compareTo(value) < 0){
            add(value, root.getLeftNode());
        }
        else{
            if(root.getValue().compareTo(value) < 0){
                root.setLeftNode(value);
            }
        }
    }

    private void add(E value, BinaryNode<E> currentNode){
        if(currentNode.hasRightNode() && root.getValue().compareTo(value) >= 0){
            add(value, currentNode.getRightNode());
        }
        else{
            if(currentNode.getValue().compareTo(value) >= 0){
                currentNode.setRightNode(value);
            }
        }

        if(currentNode.hasLeftNode() && currentNode.getValue().compareTo(value) < 0){
            add(value, currentNode.getLeftNode());
        }
        else{
            if(currentNode.getValue().compareTo(value) < 0){
                currentNode.setLeftNode(value);
            }
        }
    }

    /**
     * @return the root node of the tree
     */
    public BinaryNode<E> getRoot() {
        return root;
    }

    /**
     * @return the size of the tree,
     */
    public int getSize() {
        return size;
    }
}

//CSC 345 Data Structures
//Matthew Tennyson
//March 31, 2016
//
//Modified By: Nathan Borchelt
//Assignment 4
//March 8, 2022
//
//Description:
//  This class contains an implementation of the Stack ADT using a linked
//  data structure.

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


public class LinkedStack_nborchelt implements Stack
{
    private Node root;
    public LinkedStack_nborchelt()
    {
        root = null;
    }
    public void push(Object o)
    {
        Node n = new Node(o, root);
        root = n;

    }
    public Object pop()
    {
        if(root==null)
            throw new RuntimeException("Can't pop from empty stack");
        Object result = root.getValue();
        root = root.getNext();
        return result;
    }
    public Object peek()
    {
        if(root==null)
            throw new RuntimeException("Can't peek at empty stack");
        return root.getValue();
    }
    public int size()
    {
        return size(root,0);
    }
    private int size(Node current,int s)
    {
        if(current != null)
        {
            s++;
            return(size(current.getNext(),s));
        }
        return s;
    }
    public boolean isEmpty()
    {
        return (root==null);
    }
    public String toString()
    {
        String str = "(top) [ ";
        Node n = root;
        while(n!=null)
        {
            str += n.getValue() + " ";
            n = n.getNext();
        }
        return str + "]";
    }
}

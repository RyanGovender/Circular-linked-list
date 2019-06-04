/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinkedlist;

/**
 *
 * @author 21614
 */
public class Node<T> implements NodeInterFace<T> {
    private T item;
    private Node nextPointer;
    
    Node()
    {
        item=null;
        nextPointer=null;
    }
    
    Node(T value,Node next)
    {
        item=value;
        nextPointer=next;
    }
    
    @Override
    public T getItem()
    {
        return item;
    }
    @Override
    public Node getnextPointer()
    {
        return nextPointer;
    }
    
    @Override
    public void setItem(T val)
    {
        item=val;
    }
    
    @Override
    public void setNextPointer(Node next)
    {
        nextPointer=next;
    }
        
        
    
    
}

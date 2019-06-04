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
public interface NodeInterFace<T> {
    public T getItem();
    public Node getnextPointer();
    public void setItem(T val);
    public void setNextPointer(Node next);
    
}

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
public interface CListInteeface<T> {
    public boolean isEmpty();
    public void AddFront(T item);
    public void display();
    public void AddBack(T item);
    public T RemoveFront();
    public T RemoveBack();
    public boolean Search(T item);
    
}

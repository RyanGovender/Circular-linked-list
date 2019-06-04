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
public class CircularLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CListInteeface<Integer> list = new CList<>();
        System.out.println("-----Add to front-----");
        list.AddFront(45);
        list.AddFront(4);
        list.AddFront(8);
        list.AddFront(54);
        list.AddFront(100);
        list.AddBack(77);
        list.AddBack(24);
        list.AddBack(19);
       // list.RemoveFront();
        list.RemoveBack();
        System.out.println("Does this list contain 8: "+list.Search(8));
        list.display();
       
    }
    
       
    
}

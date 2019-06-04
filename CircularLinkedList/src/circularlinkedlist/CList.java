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
public class CList<T> implements CListInteeface<T> {
    private Node head;
    private Node last;
    private int size;
    
    CList()
    {
        head=null;
        last=null;
        size=0;
    }
    
    @Override
     public boolean isEmpty()
     {
         return (head==null && size==0);
     }
     public int getSize()
     {
         return size;
     }
         
     
    @Override
     public void AddFront(T item)
     {

        if(!isEmpty())
        { 
            Node node= new Node(item,head);
           if(size==1)
           {
               last=head;
               last.setNextPointer(head);
           } 
 
           head=node;            
           last.setNextPointer(head);
        }
        else
        {
            head= new Node(item,null);
        }
            size++;
     }
     
    @Override
     public void AddBack(T item)
     {
         if(!isEmpty())
         {
           Node node= new Node(item,last.getnextPointer());
           last.setNextPointer(node);
           last=node;
           }
         else
         {
             AddFront(item);
         }
             size++;
     }
    @Override
      public T RemoveFront()
      {
          T value=null;
          if(!isEmpty())
          {
              if(size==1)
              {
                  value =(T)head.getItem();
                  head=last=null;
              }
              else
              {
                 value= (T)head.getItem();
                 Node temp=head.getnextPointer();
                 head.setNextPointer(null);
                 head=temp;
                 last.setNextPointer(head);
              }  
              size--;
          }
              return value;
      }
    @Override
      public T RemoveBack()
      {
          T value = null;
          if(!isEmpty())
          {
              if(size==1)
              {
                  value =(T)head.getItem();
                  head=last=null;
              }
              else
              {
                  int count=0;
                  value= (T)last.getItem();
                  Node current=head;
                  while(count<size-1)
                  {
                      current=current.getnextPointer();
                      count++;
                  }
                  last.setNextPointer(current);
              }
          }
            return value;  
      }
    @Override
         public boolean Search(T item)
         {
              Node current = head;
             for(int i=0;i<size-1;i++)
             {
                 if (current.getItem()==item)return true;
                 current=current.getnextPointer();
             }
             return false;
         }
             
}

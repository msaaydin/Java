/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlistgeneric;

/**
 *
 * @author MSa
 */
public class DoublyLinkedList<T> {
    Node<T> head;

    void addFirst(T data){
        Node<T> n = new Node(data);
       
        if( head == null){
            head = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
    }
    void addLast(T data){
        Node n = new Node(data);
        n.next = null;
        if( head == null){
            head = n;            
        }
        else{
            Node temp = head;
            while( temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
        }
    }
    void printList(){
         Node temp = head;
         if (temp == null){
             throw new myException("List is empty there is no element");
         }
         else{
             while(temp != null){
                 System.out.print(temp.data+" => ");
                 temp = temp.next;
             }
             System.out.println("null");                  
         }         
    }
    int sizeList(){
        Node temp = head;
        int counter = 0;
        
        if(temp == null)
            throw new myException("There is no item, list is empty");
        else{
            while(temp !=null)
            {
                counter++;
                temp = temp.next;
            }                
        }
      return counter;
    }
}
class myException extends RuntimeException{

    public myException(String message) {
        super(message);
    }
    
}

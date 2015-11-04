/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Beyza Karabul
 * @param <E>
 */
public class LinkedList <E> {
    Node head;
    
    Node removeFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }
    
    void addLast(E data){
        Node n = new Node(data);
        
        if( head == null){
            head = n;
        }
        else{
            Node temp = head;
            while(temp.next != null ){
                temp = temp.next;
            }
            temp.next = n; 
        }
        
    }
    
    
    void printList(){
        if( head == null)
            System.out.println("Empty list.");
        else{
            Node temp = head;
            while(temp != null ){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

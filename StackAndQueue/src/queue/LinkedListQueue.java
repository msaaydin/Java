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
public class LinkedListQueue <E>{
    LinkedList<E> list = new LinkedList<>();
    int size;
    
    void enqueue(E data){
        list.addLast(data);
        size++;
    }
    
    E dequeue() throws Exception{
        if( size == 0)
            throw new Exception("The queue is empty");
        
        Node temp = list.removeFirst();
        size--;
        return (E) temp.data;
    }
    
    void printQueue(){
        list.printList();
    }
     
    
    public static void main(String[] args) {
        try {
            LinkedListQueue kuyruk = new LinkedListQueue();
            kuyruk.enqueue(1);
            kuyruk.enqueue(2);
            kuyruk.enqueue(3);
            kuyruk.dequeue();
            kuyruk.dequeue();
            kuyruk.dequeue();
            kuyruk.dequeue();
            kuyruk.printQueue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

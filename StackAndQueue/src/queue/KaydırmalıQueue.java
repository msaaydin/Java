
package queue;

import java.lang.reflect.Array;


public class KaydırmalıQueue <E>{
    E array[];
    int size;
    
    KaydırmalıQueue(Class<E> c,int capacity) {
        array = (E[]) Array.newInstance(c,capacity);
    }
    
    void enqueue(E data) throws Exception{
        if( size == array.length)
            throw new Exception("The queue is full");
        else{
            array[size] = data;
            size++;
        }   
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    int size(){
        return size;
    }
    
    E front() throws Exception{
        if( size == 0)
            throw new Exception("The queue is empty");
        return array[0];
    }
    
    E dequeue() throws Exception{
        
        if( size == 0)
            throw new Exception("The queue is empty");
        else{
            E temp = array[0];
            for (int i = 0; i < size-1; i++) {
                array[i] = array[i+1];
            }
            size--;
            return temp;
        }
    }
    
    void printQueue(){
        if( size == 0)
            System.out.println("Empty");
        for (int i = 0; i < size; i++) {
            System.out.print( array[i] + " ");
        }
    }
    
   
    
    public static void main(String[] args) {
        try {
            KaydırmalıQueue kuyruk = new KaydırmalıQueue(Integer.class,3);
            kuyruk.enqueue(1);
            kuyruk.enqueue(2);
            kuyruk.enqueue(3);
            System.out.println("silinen: " + kuyruk.dequeue());
            System.out.println("silinen: " + kuyruk.dequeue());
            System.out.println("silinen: " + kuyruk.dequeue());
            System.out.println("silinen: " + kuyruk.dequeue());
            kuyruk.enqueue(4);
            kuyruk.printQueue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       int a = 5;
        System.out.println(a >> 1);
        
    }
}

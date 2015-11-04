
package queue;

import java.lang.reflect.Array;


public class CircularQueue <E> {
    E array[];
    int front=0, rear=0;
    int size=0;
    
    CircularQueue(Class<E> c,int capacity) {
        array = (E[]) Array.newInstance(c,capacity);
    }
    
    void enqueue(E data) throws Exception{
        if( size == array.length)
            throw new Exception("The queue is full");
        else{
            array[rear] = data;
            //rear = (rear+1) % array.length;
            rear++;
            if( rear % array.length == 0 ) 
               rear = 0;
            size++;
        }    
    }
    
    E dequeue() throws Exception{
        if( size == 0)
            throw new Exception("The queue is empty");
        else{
            E temp = array[front];
            front++;
            if( front % array.length == 0)
                front = 0;
            size--;
            return temp;
        }
    }
    
    void printQueue(){
        if( size == 0)
            System.out.println("Empty queue");
        else{
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print( array[index] + " ");
                index++;
                if( index % array.length == 0)
                    index = 0;
            }
        }
        System.out.println("");
    }
    
    
    
    public static void main(String[] args) {
        try {
            CircularQueue kuyruk = new CircularQueue(Integer.class,3);
            kuyruk.enqueue(1);
            kuyruk.enqueue(2);
            kuyruk.enqueue(3);
            kuyruk.printQueue();
            System.out.println("Silinen: " + kuyruk.dequeue() );
            System.out.println("Silinen: " + kuyruk.dequeue() );
            System.out.println("Silinen: " + kuyruk.dequeue() );
            System.out.println("Silinen: " + kuyruk.dequeue() );
            kuyruk.enqueue(6);
            kuyruk.printQueue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}

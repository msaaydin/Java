package midtermfindminelementqueue;

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
 
   
}

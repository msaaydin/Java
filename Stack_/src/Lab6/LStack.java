
package Lab6;

// LinkedList Based Stack

public class LStack {
    
    LinkedList list = new LinkedList();
    int size;
    
    void push (int data){
        list.addFirst(data);
        size++;
    }
   
    int pop(){
        if( size > 0){
            size--;
            return list.removeFirst().data;
        }
        else
            throw new stackException("List is empty");
    }
     
    int size(){
        return size;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    int peek(){
        if( size > 0)
            return list.head.data;
        else
            throw new stackException("List is empty");  
    }
    
    void print(){
        list.printList();
    }
            
    class stackException extends RuntimeException{
        stackException(String message){
            super(message);
        }
    }
    
    public static void main(String[] args) {
        
        LStack s = new LStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.pop();
        s.pop();
        s.pop();
        s.print();
    }
    
}

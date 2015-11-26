
package NonGeneric;

public class DLinkedList {
    Node head;
    
    void addFirst(int data){
        Node n = new Node(data);
        
        if( head == null){
            head = n;
            
        }
        else{
            n.prev = null;
            n.next = head;
            head.prev = n;
            head = n;
        }
    }
    
    void addLast(int data){
        Node n = new Node(data);
        
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
    
    void insertAfter(int data, int position){
        
        if( position < 0 )
            throw new LinkedListException("Position cannot be negative");
            
        if(head == null)
            throw new LinkedListException("LinkedList is empty");
        
        Node n = new Node(data);
        Node temp = head; // head e dokunma
        int i = 0;
        while( position > i && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null)
            throw new LinkedListException("Position greater than list size");

        if( temp.next != null){
            n.next = temp.next;
            temp.next.prev = n;
        }
        temp.next = n;
        n.prev = temp;
    }
    
    
    Node removeFirst(){
        if(head == null)
            throw new LinkedListException("LinkedList is empty");        
        Node temp = head;        
        head = head.next;
        head.prev = null;    
        return temp;
    }
    
    Node removeLast(){
        if(head == null)
            throw new LinkedListException("LinkedList is empty");        
        Node temp = head;
        if( head.next == null){
            head = null;
        }
        else{
            while( temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
            temp.prev = null;
        }
        return temp;
            
    }
    void removeExactElement(int data){
       Node temp = head;
       if(temp == null)
            throw new LinkedListException("LinkedList is empty");
       if( temp.prev == null && temp.data == data){
            head = head.next;
            head.prev = null;
        }
        else{
            while( temp != null){                
                if (temp.data == data){
                    if (temp.next == null){  // last node
                        temp.prev.next = null;
                        temp.prev = null;                        
                    }
                    else{ // middle node
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev.next;
                    }                        
                }                    
                temp = temp.next;
            }            
        }
       
       temp = null;
    }
    
    
    void printList(){
        if( head == null){
            System.out.println("Empty dlist");
        }
        else{
            Node temp = head;
            while( temp!= null){
                System.out.print(temp.data+"=> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    @Override
    protected DLinkedList clone(){
        return this;
    }
    
    
    class LinkedListException extends RuntimeException{
        LinkedListException(String message){
            super(message);
        }      
    }
}

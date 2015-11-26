
package midtermfindminelementqueue;

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
    
 
}

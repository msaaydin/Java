
package Lab6;

//CircularLinkedList

public class CLinkedList {
    
    Node head;
    Node tail;
    
    void addFirst(int data){
        Node n = new Node(data);
        if( head == null){
            head = n;
            tail = n;
            head.next = n;
        }
        else{
            n.next = head;
            tail.next = n;
            head = n;
        }
    }
    
    void addLast( int data){
        Node n = new Node(data);
        if( head == null){
            head = n;
            tail = n;
            head.next = n;
        }
        else{
            n.next = head;
            tail.next = n;
            tail = n;
        }
        
    }
    
    void printList(){
        if(head == null){
            System.out.println("Empty llist");
        }
        else{
            Node temp = head;
            while(temp != tail){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println(tail.data);
        }
    }
    
    
    //BURADAN DEVAM EDİNİZ............
    
    
    
    public static void main(String[] args) {
        
        CLinkedList list = new CLinkedList();
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addFirst(3);
        list.printList();
    }
}

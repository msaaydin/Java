

package Lab6;

public class LinkedList {
    Node head;
    void addFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    Node removeFirst() {
        Node temp = head;
        if (head != null) {
            head = head.next;
        }
        return temp;
    }
    
    void printList(){
        if( head == null){
            System.out.println("Empty list");
        }
        else{
            Node temp = head;
            while( temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}

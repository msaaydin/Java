
package NonGeneric;
public class Test {
    
    public static void main(String[] args) {
        
        DLinkedList dlist = new DLinkedList();
        dlist.addFirst(3);
        dlist.addFirst(25);
        dlist.addLast(8785);
        dlist.addLast(87);
        dlist.addLast(5);
        dlist.addLast(5454);        
        dlist.insertAfter(94, 0);
        dlist.insertAfter(4, 2);
        dlist.insertAfter(94888, 5);  
        dlist.printList();
        dlist.removeExactElement(87);
        dlist.printList();
        dlist.removeExactElement(25);
        dlist.printList();
        dlist.removeExactElement(5454);
        dlist.printList();
        dlist.removeExactElement(8785);
        dlist.printList();       
    }
}


package stack;


public class LinkedListStack <E>{
    LinkedList<E> list = new LinkedList<>();
    int size;

    void push(E data) {
        list.addFirst(data);
        size++;
    }
    E pop() {
     
            size--;
            return (E) list.removeFirst().data;
       
    }
    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    E peek()  {
        if (size > 0) {
            return (E) list.head.data;
        } else {
            System.out.println("List is empty");
            return null;
        }
    }

    void print() {
        list.printList();
    }
    
    

    public static void main(String[] args) {

        LinkedListStack s = new LinkedListStack();
        s.push(0);
        s.push(1);
        s.push(2);
        System.out.println(s.pop());        
        s.push(85);
        System.out.println(s.peek());        
        s.push(45);
        System.out.println(s.pop());        
        s.push(15);
        System.out.println(s.peek());
        s.push(234);
        System.out.println(s.pop());        
        s.push(17);
        System.out.println(s.peek());
        System.out.println(s.pop());        
        s.push(2487);
        System.out.println("stack size"+s.size());
        
        
      
    }
}


package stack;

import java.util.ArrayList;


public class ArrayListStack <E> {
    ArrayList<E> list = new ArrayList();
    int size;

    void push(E data) {
        list.add(size, data);
        size++;
    }
    
    E pop() throws Exception {
        if (size > 0) {
            size--;
            return list.remove(size);
        } else {
            throw new Exception("List is empty");
        }
    }
    
    int size() {
        return size;
    }
    
    boolean isEmpty() {
        return size == 0;
    }   
    
    E peek() throws Exception {
        if (size > 0) {
            return list.get(size-1);
        } else {
            throw new Exception("Stack is empty");
        }
    }
    
    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
    } 

    public static void main(String[] args) {

        ArrayListStack s = new ArrayListStack();
        try {
           System.out.println(s.peek());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        s.print();
    }
}


package stack;

import java.lang.reflect.Array;



public class ArrayStack <E> {
    E array[];
    int size;

    ArrayStack(Class<E> c,int capacity) {
        array = (E[]) Array.newInstance(c,capacity);
    }

    void push(E data) throws Exception {
        if (size < array.length) {
            array[size] = data;
            size++;
        } else {
            throw new Exception("Stack is full");
        }
    }

    E pop() throws Exception {
        if (size > 0) {
            size--;
            return array[size];
        } else {
            throw new Exception("Stack is empty");
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
            return array[size - 1];
        } else {
            throw new Exception("Stack is empty");
        }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    
    
    public static void main(String[] args) {

        try {
            ArrayStack s = new ArrayStack(Integer.class,3);
            s.push(0);
            s.push(1);
            s.push(2);
            s.pop();
            s.print();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

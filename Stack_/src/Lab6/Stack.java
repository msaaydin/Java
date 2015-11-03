
package Lab6;

// Array Based Stack

public class Stack {
    
    int array [];
    int size;
    
    Stack(int capacity){
        array = new int[capacity];
    }
    
    void push(int data){
        if( size < array.length){
            array[size] = data;
            size++;
        }
        else
            throw new stackException("Stack is full");
    }
    
    int pop(){
        if( size > 0 ){
           size--;
           return array[size]; 
        }
        else
            throw new stackException("Stack is empty");
    }
    
    int size(){
        return size;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    int peek(){
        if( size > 0)
            return array[size-1];
        else
            throw new stackException("Stack is empty");
    }
    
    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
            
    class stackException extends RuntimeException{
        stackException(String message){
            super(message);
        }
    }
    
    public static void main(String[] args) {
        
        Stack s = new Stack(3);
        s.push(0);
        s.pop();
        s.print();
    }
}

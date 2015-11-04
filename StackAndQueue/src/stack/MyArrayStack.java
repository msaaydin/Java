/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author MSa
 */
public class MyArrayStack {
    
    int size;
    int top = 0;
    String [] stack; 

    public MyArrayStack(int size) {
       this.size = size;
       stack = new String[size];
    }
    void push(String data){
        if (top < stack.length){
          stack[top] = data;
          top++;       
        }
        else
            System.out.println("Stack is full");
    }
    String pop(){
        
        if (top <=0 ){
            return "Stack is epmty";  
        }
        else  
        {
           top--;                 
          return stack[top]; 
        }
          
    }
        
                        
    }
    




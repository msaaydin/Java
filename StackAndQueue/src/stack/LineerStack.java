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
public class LineerStack {
    
    public static void main(String[] args) {
        MyArrayStack s = new MyArrayStack(5);
        
        s.push("ali");
        s.push("veli");
        s.push("kamil");
        s.push("a");
        s.push("afkgjr");
        
        System.out.println(s.pop());
         System.out.println(s.pop());
          System.out.println(s.pop());
           System.out.println(s.pop());
            System.out.println(s.pop());
             System.out.println(s.pop());
             
    }
    
}

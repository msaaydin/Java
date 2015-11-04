
package stack;


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
         
             
    }
    
}

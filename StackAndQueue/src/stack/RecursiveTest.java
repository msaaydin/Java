
package stack;

/**
 *
 * @author MSa
 */

public class RecursiveTest {
    static void func(int n){
          if (n<=1)
              System.out.println("Hayatta en büyük hata kendini hatasız sanmaktır.");
          else
          {
             func(n-2);
               System.out.println("Hayatta en büyük hata kendini hatasız sanmaktır.");
             func(n-2);
          }
              
    }
    public static void main(String[] args) {        
        func(5);
    }
    
}

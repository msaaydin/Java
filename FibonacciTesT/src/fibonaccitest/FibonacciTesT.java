
package fibonaccitest;
/**
 *
 * @author MSa
 */
public class FibonacciTesT {

     static long[]  NonRecursiveFibonancci(int term){
        if (term == 0)
            return null;
        else if(term == 1){
            long [] fib = new long[term]; 
            fib[0] = 1;
            return fib;
        }
        else{
            long [] fib = new long[term];                
            fib[0] = 0;
            fib[1] = 1;
            
            for (int i = 2; i <term; i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }
            return fib;        
        }       
    }
     static long fibonacci(long n){
            if (n == 0 || n == 1)  // base case
               return n;
            else
                return fibonacci(n-1) + fibonacci(n-2);
    }     
     
    public static void main(String[] args) {         
        long start = System.nanoTime();
        long fbc[] = NonRecursiveFibonancci(65);
        long end = System.nanoTime();
        long executiontime = end - start;
        
        for (long a : fbc) {
            System.out.print(a + " - ");        
        }        
        System.out.println("");      
        System.out.println("program execution time.."+ executiontime +"..:nano seconds");
        long start_recursive = System.nanoTime();
        System.out.println("recursive  :"+fibonacci(65));
        long end_recursive = System.nanoTime();
        long executiontime_of_recursive = end_recursive - start_recursive;        
        System.out.println("program execution time.."+ executiontime_of_recursive +"..:nano seconds");
    }    
}

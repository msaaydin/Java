/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincollectingdynamicprogramming;

/**
 *
 * @author rivendell
 */
 
import java.util.Stack; 
class Entry{
    int a, b; 
    Entry(int a, int b) { 
      this.a = a; this.b = b;       
    } 
    public void print() { 
        System.out.printf("[ %d, %d ]", a, b); 
    } 
} 
public class CoinCollectingDynamicProgramming {
 
 
 static void print_array (int array[][]){
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j <array[i].length; j++) {
            System.out.print(array[i][j]+ "  ");
        }
        System.out.println();
    }
 }
 public static void main(String[] args) { 
         MyCoinCollecting frm = new MyCoinCollecting();
          frm.setVisible(true);
         /*  int[][] coins = { {1,0,0,0,1,0}, {0,1,0,1,0,0}, {0,0,0,1,0,1}, {0,0,1,0,0,1}, {1,0,0,0,1,0} }; 
            int row = coins.length, column = 6; 
           Stack stack; 
           Entry entry; 
           Entry temp;
        
         int[][] F = new int[row][column]; 
         F[0][0] = coins[0][0]; 
         stack = new Stack();
         stack.clear();
  
        for(int j = 1; j < column; j++){ 
          F[0][j] = F[0][j-1] + coins[0][j]; 
        } 
        for(int i = 1; i < row; i++){ 
          F[i][0] = F[i-1][0] + coins[i][0]; 
        } 
       
        
        print_array(coins);
        System.out.println("////////////////////////////////");
        print_array(F);
        System.out.println("////////////////////////////////");
        
        for( int i = 1; i < row; i++) 
        { 
              F[i][0] = F[i-1][0] + coins[i][0]; 
                  for( int j = 1; j < column; j++) 
                  { 
                        F[i][j] = Math.max(F[i][j-1], F[i-1][j]) + coins[i][j]; 
                  } 
        } 
        
          print_array(F);
          System.out.println("////////////////////////////");
          
          int i = row-1, j = column - 1; 
          temp = new Entry( i, j ); 
          stack.push(temp); 
          while(i >0 && j > 0)
          {
            if( F[i][j] == F[i-1][j] + coins[i][j])
            {
              temp = new Entry(i-1, j);
              stack.push(temp);
              i--;
            }
            else
            {
             temp = new Entry(i,j-1);
             stack.push(temp);
             j--;
            }
          }

          stack.push(new Entry(0,0));

          System.out.printf("The total number of coins is %s \n", F[row-1][column-1]);

          System.out.println("The path is :");
           while(!stack.isEmpty())
          {
            temp = (Entry) stack.pop();
            temp.print();
          }
*/
}
}

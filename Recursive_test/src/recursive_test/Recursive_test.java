/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive_test;

/**
 *
 * @author rivendell
 */
public class Recursive_test {

    /**
     * @param args the command line arguments
     */
     static int topla (int sayi){
     
        if (sayi < 1)
            return 0;
        return sayi + topla(sayi - 1);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(topla(4));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

/**
 *
 * @author Erebor
 */
public class BreakConti {
    public static void main(String[] args) {
        
        for (int i = 0; i < 12000000; i++) {
            if (i == 3)
                continue;
            if(i >= 6 && i <=8 )
                continue;
            if (i == 10)
                break;
            System.out.println("i = "+i);
        }
        
    }
}

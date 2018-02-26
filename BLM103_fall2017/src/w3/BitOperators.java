/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

/**
 *
 * @author Erebor
 */
public class BitOperators {
    public static void main(String[] args) {
        int a =  157;
        int b = 28;
        int c = b << 3;
        System.out.println("c = "+c);
        int d = (c & a) + 14;
        System.out.println("d ="+d);
        int d1 = (b & a) +14;
        System.out.println("d1 ="+d1);
        int e = d >> 2;
        System.out.println("e = "+e);
    }
}

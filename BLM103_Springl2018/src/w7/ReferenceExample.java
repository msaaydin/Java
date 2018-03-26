/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7;

/**
 *
 * @author Erebor
 */
public class ReferenceExample {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        b = a;
        b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {7, 8, 9, 5};
        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] =" + a1[i]+" , ");
        }
        System.out.println("");
        System.out.println("a1 hash code = "+a1.hashCode());
        System.out.println("b1 hash code = "+b1.hashCode());
        System.out.println("");
        for (int i = 0; i < b1.length; i++) {
            System.out.print("b1[" + i + "] =" + b1[i]+" , ");
        }
        System.out.println("");
        // reference copy 
        b1 = a1;     
        System.out.println("atamadan sonra");
        for (int i = 0; i < b1.length; i++) {
            System.out.print("b1[" + i + "] =" + b1[i]+" , ");
        }
        System.out.println("");
        System.out.println("a1 hash code = "+a1.hashCode());
        System.out.println("b1 hash code = "+b1.hashCode());
    }
}

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
public class Reference3 {
    public static void main(String[] args) {
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
        for (int i = 0; i < a1.length; i++) {
            //a1[i] = b1[i];
            a1 = b1;
        }
        
        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] =" + a1[i]+" , ");
        }
        System.out.println("");
        for (int i = 0; i < b1.length; i++) {
            System.out.print("b1[" + i + "] =" + b1[i]+" , ");
        }
        System.out.println("");
        a1[3] = 245;
        System.out.println("b1 sonucu");
        for (int i = 0; i < b1.length; i++) {
            System.out.print("b1[" + i + "] =" + b1[i]+" , ");
        }
        System.out.println("");
//        System.out.println("a1 sonucu");
//         for (int i = 0; i < a1.length; i++) {
//            System.out.print("a1[" + i + "] =" + a1[i]+" , ");
//        }
         System.out.println("");
          System.out.println("a1 hash code = "+a1.hashCode());
        System.out.println("b1 hash code = "+b1.hashCode());
    }
}

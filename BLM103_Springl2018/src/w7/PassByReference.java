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
public class PassByReference {

    public static void deneme(int a[]) { // a = b; referans ataması
        a[0] = 2345; // b[0]
        a[3] = -54;  // b[5]      
    }

    public static void deneme2(int a) { // a = b2; değer ataması
        a = 34567;

    }

    public static int[] reverseArray(int[] a) {
        int[] temp = new int[a.length];
        int index = a.length - 1;
        int index2 = 0;
        while (index2 < a.length) {
            temp[index2] = a[index];
            index--;
            index2++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3, 5, 6, 7, 8};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " , ");
        }
        System.out.println("");
        int b2 = 234;
        System.out.println("b2 = " + b2);
        deneme(b);
        deneme2(b2);
        System.out.println("b2 =" + b2); // 234, 34567
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " , ");
        }
        
        System.out.println("\nreverse edildikten sonra");
        int [] b3 = reverseArray(b);
         for (int i = 0; i < b3.length; i++) {
            System.out.print(b3[i] + " , ");
        }
        System.out.println("");

    }
}

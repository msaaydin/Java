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
public class SumAllElements {
    public static void main(String[] args) {
        int [] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (i+2)*2;
            System.out.print(array1[i]+" - ");
        }
        System.out.println();
        int toplam = 0;
        for (int i = 0; i < array1.length; i++) {
            toplam += array1[i];
        }
        System.out.println("array toplamı = "+toplam);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

import java.util.Scanner;

/**
 *
 * @author Erebor
 */
public class MyArrays {
    public static void main(String[] args) {
        // okunan 10 sayının aritmetik ortalamasını hesaplayıp,
        // bu sayılardan kaç tanesinin aritmetik ortalamadan
        // büyük olduğunu bulan program
        
        Scanner giris = new Scanner(System.in);
        int [] array =  new int[10];
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("array["+i+"] = ");
            array[i] = giris.nextInt();
            System.out.println("");
            toplam += array[i];
        }
        double average = (double)toplam / array.length;
        System.out.println("average = "+average);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average){
                counter++;
            }
        }
        System.out.println(counter+" adet array elemanı average dan büyüktür...");
    }
}

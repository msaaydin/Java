/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5;

import java.util.Scanner;

/**
 *
 * @author Erebor
 */
public class Loops {
    public static void main(String[] args) {
        // girilen bir tam sayının en büyük 
        // tam bölenini bulan program
        Scanner s = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz...");
        int sayi = s.nextInt();
        int enB = 54646846;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0){
                enB = i;
            }
        }
        System.out.println("en buyuk bolen = "+enB);
        int enB2 = -545484;
        int i =  sayi-1;
        while(i > 1){
            if (sayi % i == 0){
                enB2 = i;
                break;
            }
            i--;
            
        }
        System.out.println("en buyuk bolen2 ="+enB2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.Scanner;

/**
 *
 * @author Erebor
 */
public class ForLoop {

    public static void main(String[] args) {
        //soru 1: başklangıç ve bitiş değerleri arasındaki
        // sayıların toplamını bulan program hem for, hem while, 
        // hemde do while ile yapalımm        
        Scanner giris = new Scanner(System.in);
        int startNum, stopNum;
        System.out.println("Baslangıç değerini giriniz..");
        startNum = giris.nextInt();
        System.out.println("Bitiş değerini giriniz..");
        stopNum = giris.nextInt();
        if (startNum <= stopNum) {
            int toplam = 0;
            for (int i = startNum; i <= stopNum; i++) {
                toplam += i;
            }
            int counter = startNum;
            int toplam_2 = 0;
            while (counter <= stopNum) {
                toplam_2 += counter;
                counter++;
            }
            int toplam_3 = 0;
            do {
                toplam_3 += startNum;
                startNum++;
            } while (startNum <= stopNum);
            System.out.println("for ile toplam sonucu = " + toplam);
            System.out.println("while ile toplam sonucu = " + toplam_2);
            System.out.println("do while ile sonucu = " + toplam_3);
        }
        else{
            System.out.println("hopp hacı start number stop tan buyuk olamaz..");
        }

    }
}

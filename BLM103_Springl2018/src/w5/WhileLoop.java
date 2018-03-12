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
public class WhileLoop {

    public static void main(String[] args) {
        // klavyeden 0 girilene kadar girilen sayılarn 
        // ortalamasını, kaç adet çift, kaç adet tek,
        // kaç adet 4 ün katı, kaç adet 9 un katı 
        // olduğunu bulan programı while-loop ile yapınız.
        int sayiAdet = 0, cift = 0, tek = 0, dortKati = 0, dokuzKati = 0;
        double ortalama = 0;
        int toplam = 0;
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi = giris.nextInt();
        while (sayi != 0) {
            toplam += sayi;
            sayiAdet++;
            if (sayi % 2 == 0){
                cift++;
            }else{
                tek++;
            }
            if (sayi % 4 == 0){
                dortKati++;
            }
            if (sayi % 9 == 0){
                //dokuzKati++;
                dokuzKati +=1;
            }
            System.out.println("Bir sayi giriniz...");
            sayi = giris.nextInt();
        }
        ortalama = (double)(toplam / sayiAdet);
        System.out.println("toplam ="+sayiAdet+" adet sayı girilmiştir.");
        System.out.println("girilen sayıların toplamı = "+toplam);
        System.out.println("ortalama = "+(toplam / sayiAdet));
        System.out.println("cast edilmis ortalama = "+ortalama);
        System.out.println("teklerin sayısı = "+tek);
        System.out.println("ciftlerin sayısı = "+cift);
        System.out.println(" 4 un katı = "+dortKati);
        System.out.println(" 9 un katı = "+dokuzKati);
        

    }
}

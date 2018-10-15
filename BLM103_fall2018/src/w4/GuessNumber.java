/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Erebor
 */
public class GuessNumber {

    public static void main(String[] args) {
        // bir sayı tahmin oyunu oynayalım,
        // 5 adet hakkımız olsun,
        // bilgisayarın üretmiş olduğu bir sayıyı tahmin edelim,
        // her haf 20 puan olsun,
        Scanner giris = new Scanner(System.in);
        Random rst = new Random();
        int bilgisayarin_tahmin_sayisi = rst.nextInt(100);
        System.out.println("rastgele üretilen sayı = "+bilgisayarin_tahmin_sayisi);
        int tahmin_edilen_sayi, hak, puan = 100;
        System.out.println("bir sayi giriniz = ");
        tahmin_edilen_sayi = giris.nextInt();
        System.out.println("hak adedini giriniz = ");
        hak = giris.nextInt();
        int giris_sayisi = 1;
        if (tahmin_edilen_sayi == bilgisayarin_tahmin_sayisi) {
            System.out.println("kazandınız girdiğiniz sayı doğru");
        } else {
            while (giris_sayisi <= hak) {
                if (tahmin_edilen_sayi > bilgisayarin_tahmin_sayisi) {
                    System.out.println("daha kucuk bir sayı giriniz..");
                } else if (tahmin_edilen_sayi < bilgisayarin_tahmin_sayisi) {
                    System.out.println("daha buyuk bir sayı giriniz.");
                }else{
                    System.out.println("tebrikler bildiniz..");
                    break;
                }
                System.out.println("bir sayi giriniz = ");
                tahmin_edilen_sayi = giris.nextInt();
                giris_sayisi++;
            }
        }
        System.out.println("puan = "+(puan- ((giris_sayisi-1)*20)));
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5;

/**
 *
 * @author Erebor
 */
public class Methods {

    public static double furkansMetod(int sayi, int kuvvet) {
        int sonuc = 1;
        if (kuvvet > 0) {
            for (int i = 0; i < kuvvet; i++) {
                sonuc *= sayi;
            }
            return (double)sonuc;
        }else{
            kuvvet *=-1;
           for (int i = 0; i < kuvvet; i++) {
                sonuc *= sayi;
           } 
           return (double)1/sonuc;
        }

        
    }

    public static int kareHesapla(int sayi) {
        int kare = sayi * sayi;
        // return sayi * sayi;
        return kare;
    }

    public static double mutlakDeger(double sayi) {
        if (sayi < 0) {
            sayi *= -1;
            return sayi;
        } else {
            return sayi;
        }
    }

    public static void ekranaYaz(String message, int sayi) {
        for (int i = 0; i < sayi; i++) {
            System.out.println(i + ". " + message);
            if (i > 10) {
                break;
                //return;
            }
        }
        System.out.println("break ile kırma sonucu oluşan program");
    }

    public static void main(String[] args) {
        // parametre olarak gönderilen mesajı,
        // parametre olarak gönderile sayı kadar ekrana yazan 
        // metod ve test programını yazınız..
        ekranaYaz("başka bir şey söyledik..", 80);
        double donenSayi = mutlakDeger(-1545.54);
        System.out.println("mutlak degeri = " + donenSayi);
        System.out.println("sayının karesi = " + kareHesapla(4));
        double kuvvetSonucu = furkansMetod(8, 3);
        System.out.println("kuvvet sonucu = " + kuvvetSonucu);
        
     
        
    }
}

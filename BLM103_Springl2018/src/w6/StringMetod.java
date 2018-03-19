/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

/**
 *
 * @author Erebor
 */
public class StringMetod {

    public static int strinIslemler(String s) {
        // s = "Fatih sUltan mehmet VAkif Universitesi"
        int seslHarfsayisi = 0;
        s = s.toLowerCase();
        // string'in uzunluğunu gösteren bir metod var
        //   uzunluk = str.length()
        // str = "ali";
        // uzunluk = str.length() 
        // uzunluk  = 3
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'ü'
                    || s.charAt(i) == 'ı' || s.charAt(i) == 'ö') {
                seslHarfsayisi++;
            }
        }

        return seslHarfsayisi;
    }

    public static String strinIslemler(String s, int baslangic, int bitis) {
        String temp = "";
        if (bitis > s.length()) {
            System.out.println("bitis index i string in uzunluğundan buyuk olamaz..");
            return "hata";
        } else {
            for (int i = baslangic + 1; i < bitis; i++) {
                temp += s.charAt(i);
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        // paremetre olarak gönderilen string in
        // sesli harflerinin sayısını bulan metodu yazını??
        String s = "ahmeT mEhmet";
        System.out.println("uzunluk = " + s.length());
        System.out.println("3. karakter = " + s.charAt(3));
        System.out.println("buyuk harf  = " + s.toUpperCase());
        System.out.println("kucuk harf  = " + s.toLowerCase());
        System.out.println("sesli harf bulan metod");
        int sesliHarf = strinIslemler("Fatih ");
        System.out.println("sesl harf sayısı = " + sesliHarf);
        // soru 2 = parametre olarak bir adet string ve iki adet int
        // değişken alan stringislem metodu aldığı string in
        // baslangıç ve bitis indexleri arasındaki bölümü geri 
        // döndürecektir.
        String s1 = strinIslemler("biyomedikal elektronik muh...", 3, 90);

        System.out.println("parse edilen string = " + s1);
    }
}

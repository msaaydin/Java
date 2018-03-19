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
public class Overload2 {

    public static void yazdir(String s) {
        System.out.println(s);
    }
     public static void yazdir() {
        System.out.println("hello ");
    }


    public static void yazdir(String s, int kactane) {
        for (int i = 0; i < kactane; i++) {
            System.out.println(s);
        }

    }
    public static int yazdir(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0){
                toplam += i;
            }
        }
        return toplam;
    }
    

    public static void main(String[] args) {
        yazdir("bme eem");
        System.out.println("*****************");
        yazdir("bme eem",10);
        int sonuc = yazdir(10);
        System.out.println("sonuc = "+sonuc);
        yazdir();
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7;

import java.util.Scanner;

/**
 *
 * @author Erebor
 */
public class Array1 {

    public static void main(String[] args) {
        // String bir array içerisindeki her bir 
        // elemanın sesli harf sayısını ekrana ayrı ayrı yazan 
        // programı yazınız..
        Scanner giris = new Scanner(System.in);
        String[] kelimeler = new String[5];
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("lutfen " + (i + 1) + ". kelimeyi giriniz..");
            kelimeler[i] = giris.next();
        }

        for (int i = 0; i < kelimeler.length; i++) {
            String s = kelimeler[i];
            int sesliSaiyisi = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e'
                        || s.charAt(j) == 'o' || s.charAt(j) == 'u'
                        || s.charAt(j) == 'i') {
                    sesliSaiyisi++;
                }

            }
            System.out.println(kelimeler[i] + "kelimesinde toplam ="
                    + sesliSaiyisi + " kadar sesli harf vardır...");

        }
    }
}

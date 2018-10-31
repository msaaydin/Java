/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

import java.util.Random;

/**
 *
 * @author Erebor
 */
// 10 ayrı sınıfta bulunan 50 öğrencinin notlarının 
// tutulduğu bir not tablosundaki, her sınıftaki
// en yüksek notu alan öğrenciyi bulan programı yazınız.
public class TwoDimensionalArray2 {

    public static void main(String[] args) {
        int[][] notlar = new int[10][20];
        Random r = new Random();
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                notlar[i][j] = r.nextInt(100);
            }
        }
        int[] maxnots = new int[notlar.length];
        for (int i = 0; i < notlar.length; i++) {
            int max = notlar[i][0];
            for (int j = 1; j < notlar[i].length; j++) {
                if (notlar[i][j] > max){
                  maxnots[i] = notlar[i][j]; 
                  max  = notlar[i][j];
                }
            }
        }
        for (int i = 0; i < maxnots.length; i++) {
            System.out.print(maxnots[i]+",");
        }
        System.out.println("");
    }
}

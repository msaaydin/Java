/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7;

import java.util.Random;

/**
 *
 * @author Erebor
 */
public class SumAllElements {
    public static void main(String[] args) {
        int [] elmaSayisi = new int[10];
        Random r = new Random();
        for (int i = 0; i < elmaSayisi.length; i++) {
            elmaSayisi[i] = r.nextInt(250);
            System.out.println(i+"."+elmaSayisi[i]);
        }    
        int kacinci = 0;
        int enbuyukElma = -1;
        for (int i = 0; i < elmaSayisi.length; i++) {
            if (elmaSayisi[i] > enbuyukElma){
                enbuyukElma = elmaSayisi[i];
                kacinci = i;
            }
        }
        System.out.println("en buyuk elma = "+enbuyukElma);
        System.out.println("en buyuk kacinci elma = "+kacinci);
        
    }
}

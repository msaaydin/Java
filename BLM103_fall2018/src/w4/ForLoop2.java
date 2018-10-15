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
public class ForLoop2 {

    public static void main(String[] args) {
        //Bir aralıktaki değeri çift ve tek 
        //elemanların aritmetik ortamasının arasındaki farkı bulunuz.
        Scanner giris = new Scanner(System.in);
        int baslangic, bitis, tekToplam = 0, ciftToplam = 0, tekAdet = 0, ciftAdeti = 0;

        System.out.println("baslangis degerini giriniz..");
        baslangic = giris.nextInt();
        System.out.println("bitis degerini giriniz.");
        bitis = giris.nextInt();
        for (int i = baslangic; i <= bitis; i++) {
            if (i % 2 != 0) {
                tekToplam += i;
                tekAdet++;
            } else {
                ciftToplam += i;
                ciftAdeti++;
            }
        }
        double tekAritmetikOrt = (double) (tekToplam / tekAdet);
        double ciftAritmetikOrt = (double) (ciftToplam / ciftAdeti);
        System.out.println("cift aritmetik ort = " + ciftAritmetikOrt);
        System.out.println("tek aritmetik ort = " + tekAritmetikOrt);
        System.out.println("tek ve cift sayıların aritmetik ort farkı = "
                + (tekAritmetikOrt - ciftAritmetikOrt));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

import java.util.Scanner;

/**
 *
 * @author Erebor
 */
public class Selection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aylar;
        System.out.println("Bir ay numarası giriniz..:");
        aylar = input.nextInt();
        if (aylar <= 0 || aylar > 12) {
            System.out.println("hatalı ay numarası girişşi yaptınız.");
        } else {
            if (aylar == 1) {
                System.out.println("ocak");
            } else if (aylar == 2) {
                System.out.println("şubat");
            } else if (aylar == 3) {
                System.out.println("mart");
            } else if (aylar == 4) {
                System.out.println("nisan");
            } else if (aylar == 5) {
                System.out.println("mayıs");
            } else if (aylar == 6) {
                System.out.println("hziran");
            } else if (aylar == 7) {
                System.out.println("temmuz");
            } else if (aylar == 8) {
                System.out.println("ağustos");
            } else if (aylar == 9) {
                System.out.println("eylül");
            } else if (aylar == 10) {
                System.out.println("ekim");
            } else if (aylar == 11) {
                System.out.println("kasım");
            } else if (aylar == 12) {
                System.out.println("aralık");
            }
        }

        switch (aylar) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 9:
                System.out.println("eylül");
                break;
            default:
                System.out.println("yanlış ay numarası girildi.");

        }
    }
}

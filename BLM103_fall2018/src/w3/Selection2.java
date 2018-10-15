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
/* girilen sayının
Hem 5’e hem 2’ye bölünebilir
Sadece 5’e bölünebilir
Sadece 2’ye bölünebilir
Ne 5’e ne de 2’ye bölünebilir*/
public class Selection2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("bir sayı giriniz..");
        number = input.nextInt();
        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println("Hem 5’e hem 2’ye bölünebilir");
        } else if (number % 5 == 0) {
            System.out.println("Sadece 5’e bölünebilir");
        } else if (number % 2 == 0) {
            System.out.println("Sadece 2’ye bölünebilir");
        } else if (number % 2 != 0 && number % 5 != 0) {
            System.out.println("Ne 5’e ne de 2’ye bölünebilir");
        }

    }
}

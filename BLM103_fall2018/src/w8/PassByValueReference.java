/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w8;

import java.util.Random;

/**
 *
 * @author Erebor
 */
public class PassByValueReference {

    static void metod1(int[] c) {
        System.out.println("c arrayi reference degeri = " + c.hashCode());
        int a, b, d;
        a = c[0];
        a++;
        System.out.println("a = " + a);
        b = c[3]++;
        System.out.println("b = " + b);
        d = c[5];
        d--;
        System.out.println("d =" + d);
    }

    static char[] generateAlphabet() {
        char[] alfabe = new char[26];
        for (int i = 0; i < 26; i++) {
            alfabe[i] = (char) (i + 97);
        }
        System.out.println("metod içindeki alfabe arrayi reference = " + alfabe.hashCode());
        return alfabe;
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n*******");
    }

    static void printArrayChar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n*******");
    }

    // rastgele rakamlar ve karakterlerden oluşan 8 haneli,
    //şifreler üreten bir metod yazınız..
    // metod tek bir parametre alacaktır. bu parametre kaç adet şifrenin
    // üretilmesi gerektiğidir.
    static String[] generatePassword(int num,int passlen) {
        String[] pass = new String[num];       
        Random r = new Random();
        for (int i = 0; i < num; i++) {
             String s = "";
            for (int j = 0; j < passlen; j++) {
                s += (char)(48+(r.nextInt(74))); 
                //pass[i] +=(char)(48+(r.nextInt(74)));
            }
            pass[i] = s;
        }
        return pass;
    }
    static void mySwap(int [] array){
        int max = array[0];
        int min = array[0];
        int maxindex = 0, minindex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxindex = i; // yeni bir max buldun tamammı
                // ve o max ta buradadır bunu tutman gerekiyor.....yorrr
            }
            if (array[i] < min){
                min = array[i];
                minindex = i; // yeni bir min buldun tamammı
                // ve o min de buradadır bunu tutman gerekiyor.....yorrr
            }
        }
       
        int bosbardak = array[maxindex]; // kola burada
        array[maxindex] = array[minindex]; // ayranı boşalan kolanın yerine döktük.
        array[minindex] = bosbardak;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("array 2 reference degeri = " + array2.hashCode());

        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        mySwap(array);
        System.out.println("");
        printArray(array);
        System.out.println("\n**************");
        printArray(array2);
        metod1(array2);
        printArray(array2);
        char[] alfabe1 = generateAlphabet();
        System.out.println("main metod içindeki alfabe1 arrayi reference = " + alfabe1.hashCode());
        printArrayChar(alfabe1);
        System.out.println((char) (0x5f));
        String [] passWord = generatePassword(5, 10);
        for (String string : passWord) {
            System.out.println(string);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7;

/**
 *
 * @author Erebor
 */
public class Method {

    // soru 1
    // parametre olarak gönderilen string'i
    // yine parametre olarak gönderilen sayı kadar ekrana yazan 
    // metodu yazınız...
    public static void myPrint(String s, int num) {
        int counter = 0;
        while (counter < num) {
            System.out.println(s);
            counter++;
        }
    }

    // soru 2: parametre olarak gönderilen 2 adet tam sayıyı 
    // toplayıp, toplam sonucunu geri döndüren metodu yazınız.
    public static short myToplam(short s1, short s2) {
        short toplam = (short) (s1 + s2);
        return (short) (s1 + s2);
        //return toplam;
    }

    // soru 3: parametre olarak gönderilen baslagıc ve bitis değerleri arasındaki
    // sayıarın aritmetik ortalamasını bulup geri döndüren metodu yazınız.
    public static double myOrtalama(int start, int stop) {
        double ortalama = .0;
        int toplam = 0;
        int adet = 0;
        int counter = start;
        while (counter <= stop) {
            toplam += counter;
            adet++;
            counter++;
        }
        ortalama = (double) (toplam / adet);
        return ortalama;
    }

    // soru 4: parametre olarak gönderilen taban ve ust değerlerini
    //kullanarak ust hesaplama işlemi yapan metodu yazınız..
    // deger = taban^ust
    public static double myPow(int taban, int ust) {

        int sonuc = 1;
        if (ust < 0) {
            ust *= -1;
            for (int i = 0; i < ust; i++) {
                sonuc *= taban;
            }
            return 1.0 / sonuc;
        } else {
            for (int i = 0; i < ust; i++) {
                sonuc *= taban;
            }
            return sonuc;
        }

    }

    public static boolean isPrime(int num) {
        boolean durum = true;
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
               if (num % i == 0){
                   durum = false;
                   return durum;
               }
            }
           return durum; 
        }

    }

    public static void mySwap(int n1, int n2) {
        // n1 = num1;
        // n2 = num2;
        int temp; // boş bardak
        // n1 kola
        // n2 ayran
        temp = n1;
        n1 = n2;
        n2 = temp;
       
    }

    public static void main(String[] args) {
        myPrint("musa aydın", 15);
        String s1 = "fsm elektronik..";
        int sayi = 35;
        myPrint(s1, sayi);
        byte b1 = 23;
        byte b2 = 23;
        byte toplam = (byte) (b1 + b2);
        short s3 = 45;
        short s4 = 345;
        System.out.println("toplam sonucu =" + myToplam((short) 23, (short) 5));
        System.out.println("toplam sonucu = " + myToplam(s3, s4));
        System.out.println("3 ile 333 arasındaki sayuların ortalamsı ="
                + myOrtalama(3, 33));
        System.out.println("34 ile 54878 arasındaki sayuların ortalamsı ="
                + myOrtalama(34, 54878));
        double ort = myOrtalama(1, 100);
        System.out.println("ortalama = " + ort);
        double ustSonuc = myPow(2, -5);
        System.out.println("ust = " + ustSonuc);
        int num1 = 23;
        int num2 = 45;
        mySwap(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println(isPrime(96));        
    }
}

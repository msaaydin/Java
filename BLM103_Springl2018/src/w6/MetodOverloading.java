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
public class MetodOverloading {
    public static void artir(int y){
        y++;
        System.out.println("x in artir metodu içerisindeki değeri = "+y);
    }
     public static int artir2(int x) {
        x++;
        System.out.println("x in artir metodu içerisindeki değeri = " + x);
        return x;
    }
    
    public static void main(String[] args) {
        int x = 2;
        System.out.println("x in main metod içerisindeki değeri ="+x);
        artir(x);
        artir(x);
        x = 4;
        artir(x+1);
        artir(x);
        System.out.println("x in metod çağrısından sonraki değeri="+x);
        x = artir2(x);
        x = artir2(x);
        x = artir2(x);
        x = artir2(x);
        System.out.println("x in metod çağrısından sonraki değeri="+x);
        int sayi = 15;
        int k = toplam(sayi);
        System.out.println("toplam sAyi = "+sayi);    
        System.out.println("toplam sAyi k = "+k); 
        
        int a1 = 2;
        int a2 = 3;
        a1 = a2;
        a1++;
        System.out.println("a2 = "+ a2);
        System.out.println("a1 = "+a1);
                
        
    }
    public static int toplam(int x){
      int toplam = 0;
        for (int i = 0; i < x; i++) {
            toplam += i;
        }
      x = toplam;
        System.out.println("toplam = "+x);
        return x;
    }
}

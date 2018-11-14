/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Erebor
 */
public class Lab7 {
//	B) Bir dizinin elemanlarının ortalamasını hesaplayan metotu yazınız.
//	C) Bir dizinin tüm elemanlarının çarpımını hesaplayan metotu yazınız.
//	D) Bir dizinin negatif elemanlarının toplamını hesaplayan metotu yazınız.
//	E) Bir dizinin elemanlarının karelerinin toplamını hesaplayan metotu yazınız.

    public static double sumOfElement(double [] array){
         double sum = 0;
            for (int i = 0; i <array.length; i++) {
                sum += array[i];
            }
           return sum; 
    }
    public static double average(double [] array){
         double ort = 0, sum = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                sum += array[i];
            }
            ort = sum / array.length;
           return ort; 
    }
    
//Bir string dizisinin elemanlarını aralarında birer boşluk bırakarak cümle haline getiren metotu yazınız.
     public static String myConcat(String []s ){
            String concat = "";
            for (int i = 0; i < s.length; i++) {
                 concat += " "+s[i];
            }
            return concat;
    }
     static boolean myCompare(String kelime1,String kelime2){
         boolean durum = false;
         if (kelime1.length() != kelime2.length()){
             return durum;
         }else{
             for (int i = 0; i < kelime1.length(); i++) {
                 if (kelime1.charAt(i) != kelime2.charAt(i)){
                     return durum;
                 }
             }
             return true;
         }
         
     }
    public static void main(String[] args) {
         String [] kelimeler = {"ali","veli","selim","halim"};
         String cumle = myConcat(kelimeler);
         System.out.println(cumle);
         if (myCompare("ahmet", "ahmey")){
             System.out.println("kelimeler eşittir..");
         }else{
             System.out.println("kelimeler eşit değildir...");
         }
         
    }
}

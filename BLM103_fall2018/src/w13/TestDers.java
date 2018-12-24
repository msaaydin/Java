/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w13;

/**
 *
 * @author msa
 */
public class TestDers {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("ali veli",1);
        Ogrenci o2 = new Ogrenci("fatih",2);
        Ogrenci o3 = new Ogrenci("şeyma",3);
        Ogrenci o4 = new Ogrenci("buse",4);
        Ogrenci o5 = new Ogrenci("kamil",5);
        o1.setNotes(o1);
        o1.setNotes(o2);
        o1.setNotes(o3);
        o1.setNotes(o4);
        o1.setNotes(o5);
        System.out.println(o4);
        Ders d1 = new Ders(10);
        if(!d1.addOgrenci(o1)){
            System.out.println("ekleme başarısız..");
        }
        if(!d1.addOgrenci(o2)){
            System.out.println("ekleme başarısız..");
        }
        if(!d1.addOgrenci(o3)){
            System.out.println("ekleme başarısız..");
        }
        if(!d1.addOgrenci(o4)){
            System.out.println("ekleme başarısız..");
        }
        if(!d1.addOgrenci(o5)){
            System.out.println("ekleme başarısız..");
        }
        d1.ogrenciListele();
        double [] ortalama1 = d1.ortHesapla(o5);
        System.out.println("ogrencinin notları...");
        System.out.println(o5);
        System.out.println("ogrencinin notlarını ortalaması...");
        int i = 1;
        for (double d : ortalama1) {
            System.out.println(i+".dersin ortalamasi = "+d);
            i++;
        }
        
        
    }
}

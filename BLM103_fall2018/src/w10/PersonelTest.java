/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w10;

/**
 *
 * @author Erebor
 */
public class PersonelTest {
    public static void main(String[] args) {
        Personel p1 = new Personel();     
        p1.setMaas(245.3456);
        p1.setAdSoyad("musa aydın");
        p1.setGender('M');
        p1.setYas(36);
        p1.setDepartment("computer eng.");
        
        PersonelHesap phesap = new PersonelHesap();
        phesap.printPerson(p1);
        phesap.modifyPerson(p1);
        phesap.printPerson(p1);
        //parametre olarak aldığı iki personelden yaşı büyük olan personelin maaşını
        // %23 artıran ve geri döndüren metodu yazınız..
        Personel p2 = new Personel();     
        p2.setMaas(4567.3456);
        p2.setAdSoyad("ahmet mehmet");
        p2.setGender('M');
        p2.setYas(56);
        p2.setDepartment("computer eng.");
        phesap.compareAge(p1, p2);
        System.out.println(p2.getMaas());
        phesap.printPerson(p2);
        
    }
    
    
}

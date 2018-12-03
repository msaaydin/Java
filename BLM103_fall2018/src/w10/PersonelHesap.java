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
public class PersonelHesap {
    public void modifyPerson(Personel p){
        p.setYas(p.getYas() - 3);
        p.setMaas(p.getMaas() + 100.5);
        p.setAdSoyad("ali veli");
    }
    public void printPerson(Personel p){
        System.out.println("Adı soyadı = "+p.getAdSoyad());
        System.out.println("Yasi = "+p.getYas());
        System.out.println("derpartment = "+p.getDepartment());
        System.out.println("Gender = "+p.getGender());
        System.out.println("maas = "+p.getMaas());
        System.out.println("***********************");
        
    }
    public void compareAge(Personel p1, Personel p2){
        if (p1.getYas() > p2.getYas()){
            p1.setMaas(((p1.getMaas()*23) / 100) + p1.getMaas());
        }else{
            p2.setMaas(((p2.getMaas()*23) / 100) + p2.getMaas());
        }
    }
}

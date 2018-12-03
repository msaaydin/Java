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
public class Personel {

    private String AdSoyad;
    private int yas;
    private double maas;
    private char gender;
    private String department;

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getYas() {
        return this.yas;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

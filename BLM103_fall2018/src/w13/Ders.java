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
// bir ders sınıfımız olsun, derse kayıtlı öğrenciler olsun,

public class Ders {
    private String dersAdi;
    private Ogrenci [] ogrenciler;
    Ders(int ogrAdet){
        ogrenciler = new Ogrenci[ogrAdet];
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }
    public boolean addOgrenci(Ogrenci o){
        for (int i = 0; i < ogrenciler.length; i++) {
            if ((ogrenciler[i] != null ) &&
                    (ogrenciler[i].getOgrId() == o.getOgrId())){
                return false;                
            }
            if(ogrenciler[i] == null){
                    ogrenciler[i] = o;
                    return true;
            }
        }
        return false;
    }
    public void ogrenciListele(){
        for (int i = 0; i < ogrenciler.length; i++) {
            if (ogrenciler[i] != null)
            System.out.println(ogrenciler[i].getAdiSoyadi()+
                    ", "+ogrenciler[i].getOgrId());
        }
    }
    public double [] ortHesapla(Ogrenci o){
        double [] ortalama = new double[3];
        for (int i = 0; i < ogrenciler.length; i++) {
            if (ogrenciler[i] != null){
                if (ogrenciler[i].getOgrId() == o.getOgrId()){                    
                    for (int j = 0; j < ortalama.length; j++) {
                         ortalama[j] = ogrenciler[i].notlar[j][0] * 0.4+
                                 ogrenciler[i].notlar[j][1] * 0.6;
                    }
                }
            }
        }
        return ortalama;
    }
    
}

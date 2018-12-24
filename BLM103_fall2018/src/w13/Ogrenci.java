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
public class Ogrenci {

    public Ogrenci(String adiSoyadi, int ogrId) {
        this.adiSoyadi = adiSoyadi;
        this.ogrId = ogrId;
    }
    
    private String adiSoyadi;
    private int ogrId;
    //private int notlar[][] = new int[ders sayısı][her dersin not adedi];
    int notlar[][] = new int[3][2];

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public int getOgrId() {
        return ogrId;
    }

    public void setOgrId(int ogrId) {
        this.ogrId = ogrId;
    }
    public void setNotes(Ogrenci o){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                o.notlar[i][j] = (int)(Math.random() * 100);
            }
        }
    }
    @Override
    public String toString(){
        String temp = this.adiSoyadi + ","+ this.ogrId+"\n";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                temp += this.notlar[i][j] + " "; 
            }
            temp += "\n";
        }
        return temp;
    }
    
}

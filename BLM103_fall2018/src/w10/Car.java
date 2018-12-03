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
//Hiz ve Maksimum_hiz alanları olan bir 
//Araba sınıfı tanımlayınız. 
//Bu sınıfta aşağıdaki metotları oluşturunuz:
//
//- Arabanın hızını 5 birim artıran metot
//- Arabanın hızını istenilen kadar artıran metot
//- Arabanın hızının maksimum_hız değerini 
//geçip geçmediğini kontrol eden metot
//- Arabanın maksimum_hız’a ulaşana kadar 
//ne kadar hızlanabileceğini hesaplayan metot

public class Car {
    private int hiz;
    private int maxHiz;
    
    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public void setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
    }
    public void hizKontrol(){
        if (this.hiz > this.maxHiz){
            System.out.println("max hızı geçtin mot güm yavaşla..");
        }
    }
    public void hizAzalt(){
        if ((this.hiz - 5) < 0){
            System.out.println("daha fazla yavaşlayamazsın negatif yavaşlama yok...");
        }else{
           this.hiz -= 5; 
        }
         
    }
    public void hizAzalt(int hiz){
        if ((this.hiz - hiz) < 0){
            System.out.println("daha fazla yavaşlayamazsın negatif yavaşlama yok...");
        }else{
           this.hiz -= hiz; 
        }
    }
    public void hizArtir(){
        if ((this.hiz + hiz) > this.maxHiz){
            System.out.println("fazla hızlanamazsın max hıza ulaştık...");
        }else{
           this.hiz += 5; 
        } 
    }
    public void hizArtir(int hiz){
         if ((this.hiz + hiz) > this.maxHiz){
            System.out.println("fazla hızlanamazsın max hıza ulaştık...");
        }else{
           this.hiz += hiz; 
        }
    }
    public int maxHizaOlanMesafe(){
        return this.maxHiz - this.hiz;
    }
    
    
}

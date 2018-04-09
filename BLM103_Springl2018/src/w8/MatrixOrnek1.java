/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w8;

/**
 *
 * @author Erebor
 */
public class MatrixOrnek1 {

    /*Parametre olarak aldığı bir multi dimension array’in 
    her satırının ortalamasını ayrı ayrı bulup tek bir array 
    içerisinde geri döndüren metodu yazınız….*/

    public static double[] satirOrtalamaHesap(double[][] ar) {
        double ort[] = new double[ar.length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ort[i] += ar[i][j];
            }
        }
        for (int i = 0; i < ort.length; i++) {
            ort[i] /= ar[0].length;
        }
        return ort;
    }
    public static int[] findCount(int [][] ar,int sayi) {
        int ret[] = new int[2];
        int toplam = 0;
        int adet = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] < sayi){
                    ret[0]++;
                    ret[1] += ar[i][j];
//                    adet++;
//                    toplam += ar[i][j];
                }
            }
        }
//        ret[0] = adet;
//        ret[1] = toplam;
        return ret;
    }

    public static void main(String[] args) {
        double[][] doubleArray = new double[5][3];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = Math.random() * 10.0;
                System.out.print(doubleArray[i][j] + " - ");
            }
            System.out.println("");
            
        }       
        
        double ortalama[] = satirOrtalamaHesap(doubleArray);
        for (int i = 0; i < ortalama.length; i++) {
            System.out.println(i+". satir ortalaması = "+ortalama[i]);
        }
        int [][] intArray = new int[3][2];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (int)(Math.random()*100.0);
                System.out.print(intArray[i][j]+"-");
            }System.out.println("");
        }
        System.out.println("");
        int sonuc[] =  findCount(intArray,50);
        System.out.println("toplam = "+sonuc[1]);
        System.out.println("adedi = "+sonuc[0]);
    }
}

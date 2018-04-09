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
public class MAtrix {
    public static double[] sumAllColumns(double [][]array){
        double [] toplamSutun = new double[array[0].length];
        
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                toplamSutun[i] += array[j][i];
            }
        }
        
        return toplamSutun;       
    }
    public static int[] findMaxElementIndex(int [][]array){
        int [] ret = new int[3];
        int temp = array[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (temp < array[i][j]){
                    temp = array[i][j];
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        ret[2] = temp;
        return ret;       
    }
    public static void main(String[] args) {
        int [][] a = new int[5][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random()*100);
                System.out.print(a[i][j]+" - ");
            }
            System.out.println("");
        }
        int [] index = findMaxElementIndex(a);
        System.out.println("max eleman = "+index[2]);
        System.out.println("koordinatlar satır = "+index[0]);
        System.out.println("koordinatlar sütun = "+index[1]);
        
        double [][] doubleArray = new double[4][3];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = Math.random()*10.0;
                System.out.print(doubleArray[i][j]+" - ");
            }
            System.out.println("");
        }
        
        double toplam[] = sumAllColumns(doubleArray);
        for (int i = 0; i < toplam.length; i++) {
            System.out.println(i+". sutun toplamı = "+toplam[i]);
        }
       
    }
}

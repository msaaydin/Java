/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

import java.util.Random;

/**
 *
 * @author Erebor
 */
public class FindMaxMinElement {
    public static void main(String[] args) {
        // bir array deki  max ve min değerler arasındaki farkı bulan 
        //  programı yazınız..
        int[] array1 = new int[20];
        Random rndGntr = new Random();
        int counter = 0;
        while (counter < array1.length) {
            array1[counter] = rndGntr.nextInt(100);           
            System.out.println("array1[" + counter + "] = " + array1[counter]);
            counter++;
        }
        int max = array1[0];
        int min = array1[0];
        byte maxIndex = 0, minIndex = 0;
        for (int i = 1; i < array1.length; i++) {
            if (max < array1[i]){
                max = array1[i];
                maxIndex = (byte)i;
            }
            if (min > array1[i]){
                min = array1[i];
                minIndex = (byte)i;
            }
        }
        System.out.println("maxindex = "+maxIndex);
        System.out.println("minindex = "+minIndex);
        System.out.println("max  - min = "+max+"-"+min+"="+ (max - min));
        
        
        
        
        
        
    }
}

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
public class InitRandomValue {

    public static void main(String[] args) {
        int[] array1 = new int[20];
        Random rndGntr = new Random();
        int counter = 0;
        while (counter < array1.length) {
            array1[counter] = rndGntr.nextInt(1000);
            System.out.println("array1[" + counter + "] = " + array1[counter]);
            counter++;

        }
        counter = 0;
        while (counter < array1.length) {            
            System.out.println("array1[" + counter + "] = " + array1[counter]);
            counter++;

        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

/**
 *
 * @author Erebor
 */
public class ValueCopy {

    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(sourceArray[i]);
        }
        sourceArray = targetArray;
        sourceArray[0]++;
        sourceArray[3]++;
        
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(targetArray[i]);
        }

    }
}

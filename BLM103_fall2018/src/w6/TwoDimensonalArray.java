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
public class TwoDimensonalArray {

    public static void main(String[] args) {
        Random r = new Random();
        // 2 boyutlu matrisi random doldurup,
        // sonra onu ekrana yazalım...
        int[][] mat = new int[10][6];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = r.nextInt(100);

            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
        System.out.println("*****************");
        int [][] mat2 = {{1,2,467,6},
                          {34,67,34,78,893,672},
                          {3,4}};
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j]+",");
            }
            System.out.println();
        }
    }
}

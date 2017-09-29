/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1;

import java.util.Iterator;

/**
 *
 * @author Erebor
 */
public class Hello {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }

        int count = 0;
        int[] someArray = new int[5];
        int c = someArray.length;
        int temp;
        try {
            while (true) {
                temp = someArray[count];
                count++;
            }
        } catch (Exception ex) {
            System.out.println(count);
        }
        int[] array = new int[100];
        int size = 0;

        for (int i : array) {
            ++size;
        }

        System.out.println("Size: " + size);
       Test1 t = new  Test1(2);
       Test t2;
  
       t.ad = "musa";
       t.yas = 34;
        System.out.println("ad="+t.ad+",  yas = "+t.yas);
       t2 = t;
        System.out.println("ad="+t2.ad+",  yas = "+t2.yas);
       t2.ad = "ali";
       t2.yas = 56;
        System.out.println("ad="+t.ad+",  yas = "+t.yas);
       
       

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rivendell
 */
public class NewClass {
    
    
    public static void main(String[] args) {
        String s  = "musa aydın";
        String s1  = "musa";
        String s2  = "asum";
        String s3  = "suma";
        
        char [] arr = s.toCharArray();
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        char [] arr3 = s3.toCharArray();
        
        Arrays.sort(arr3);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String ss1 = new String(arr1);        
        String ss2 = new String(arr2);        
        String ss3 = new String(arr3);        
        
        System.out.println("String 1 sıralamadan önceki hali..:     "+s1);
        System.out.println("String 1 sıralamadan sonraki hali.. :   "+ss1);
        System.out.println("String 2 sıralamadan önceki hali..:     "+s2);
        System.out.println("String 2 sıralamadan sonraki hali..:    "+ss2);
        System.out.println("String 3 sıralamadan önceki hali..:     "+s3);
        System.out.println("String 3 sıralamadan sonraki hali..:    "+ss3);
        
        
        //System.out.println(ss);        
        Map<String, List<String>> m = new HashMap<String, List<String>>();
    }
    
}

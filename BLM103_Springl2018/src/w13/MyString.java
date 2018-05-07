/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w13;

import java.util.Random;

/**
 *
 * @author Erebor
 */
public class MyString {
    public static void main(String[] args) {
        String s1 = "ali";
        System.out.println(s1.hashCode());
        s1 = "musa";
        System.out.println(s1.hashCode());
        String s2 = "ali";
        
        String s4 = "ali";
        
        String s3 = new String("ali");
        Random r = new Random();
        Random r2 = new Random();
        
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1.getClass().hashCode());
        System.out.println(s2.getClass().hashCode());
        System.out.println(s3.getClass().hashCode());
        String s5 = new String("a");
        System.out.println(s5.hashCode());
        System.out.println(s5.getClass().hashCode());
        System.out.println(r.hashCode());
        System.out.println(r2.hashCode());
        
        
        
        
    }
}

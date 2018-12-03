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
public class Calculator {
    int a = 0;
    public Calculator() {
        System.out.println("hesaplama baslıyorrr....:)");
    }
    public Calculator(String mes) {
        System.out.println(mes);
    }
    
    int topla(int sa1,int sa2){
        return sa1 + sa2;
    }
    double topla(double sa1,double sa2){
        return sa1 + sa2;
    }
    double cikar(double sa1,double sa2){
        return sa1 - sa2;
    }
    int cikar(int sa1,int sa2){
        return sa1 - sa2;
    }
    int carp(int sa1,int sa2){
        return sa1 * sa2;
    }
    double carp(double sa1,double sa2){
        return sa1 * sa2;
    }
    double bol(int sa1,int sa2){
        return (double)sa1 / sa2;
    }
    double bol(double sa1,double sa2){
        return (sa1 / sa2);
    }
    
    
    
    
}

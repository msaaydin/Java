/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w13;

/**
 *
 * @author Erebor
 */
public class A extends B{
//    public A(){
//        super();
//    } // default olarak yazılıyor...
    public A(){
        super("ben B class ıyım");
    }
    @Override
    public void yaz(){
        System.out.println("ben a class'ı içerisndeki yaz metoduyumm...");
        System.out.println("merhaba a class ı içinden");
        
    }
    public String toString(){
        return "A class ı";
    }
    
}

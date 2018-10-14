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
public class Kalitim {
    public static void main(String[] args) {
        //A a = new A();
        //a.yaz();
       // m(new B());
        m(new A());
        m(new Object());
    }
    public static void m(Object o){
        System.out.println(o.toString());
        
    }
}

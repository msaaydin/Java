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
public class B extends Object{
    private int a = 1345;
//   public B(){
//        System.out.println("ben B clasıyım");
//    }
    public B(String s){
        System.out.println(s);
    }
    public void yaz(){
        System.out.println("ben b super class'ı içerisndeki yaz metoduyumm...");
    }
    @Override
    public String toString(){
        return "B class ı";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w10;
import w9.*;

/**
 *
 * @author Erebor
 */
public class MetodOverLoading {
    public static void main(String[] args) {
        Calculator hesap = new Calculator("hesaplama parametreli constructer dan sonra baslıyorrr....:");
        Calculator hesap2 = new Calculator();
        
        System.out.println(hesap.topla(234.67, 3456.570));
        System.out.println(hesap.cikar(23,234));
        System.out.println(hesap2.bol(12,5678));
        FSM f = new  FSM();
        int [] a= f.fsm("ali ibiş kilim", 'i', true);
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println("");
        Circle c = new Circle();
        SallamasyonClass s = new SallamasyonClass();
    }
    
}

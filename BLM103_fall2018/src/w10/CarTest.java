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
public class CarTest {

    public static void main(String[] args) {
        Car c = new Car();
        c.setMaxHiz(120);
        c.hizArtir();
        c.hizArtir();
        c.hizArtir();
        c.hizArtir();
        c.hizArtir();

        System.out.println("su andaki hızınız = " + c.getHiz() + "km");
        c.hizArtir(90);
        System.out.println("su andaki hızınız = " + c.getHiz() + "km");
        c.hizAzalt();
        System.out.println("su andaki hızınız = " + c.getHiz() + "km");
        c.hizAzalt(110);
        System.out.println("su andaki hızınız = " + c.getHiz() + "km");
        c.hizAzalt();
        System.out.println("su andaki hızınız = " + c.getHiz() + "km");

    }
}

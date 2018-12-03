/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9;

/**
 *
 * @author Erebor
 */
public class Circle {
    double radius;

    public Circle() {
        System.out.println("merhaba ben circle class ıyım ve şu anda oluturuldummmm...");
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}

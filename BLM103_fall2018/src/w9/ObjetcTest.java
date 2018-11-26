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
public class ObjetcTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("circle radius degeri = "+c.radius);
        c.radius = 34.45;
        System.out.println("çemberin alanı = "+c.getArea());
        Circle c2 = new Circle();
        c2.radius = 345.67;
        Circle c3 = new Circle();
        c3.radius = 45;
        Circle c4 = c2;
        c2 = c3;
        c = c4;
        System.out.println("c.hashCode() = " +c.hashCode());
        System.out.println("c2.hashCode() = " +c2.hashCode());
        System.out.println("c3.hashCode() = " +c3.hashCode());
        System.out.println("c4.hashCode() = " +c4.hashCode());
        
        System.out.println("c.radius = " +c.radius);
        System.out.println("c2.radius = "+c2.radius);
        System.out.println("c3.radius = "+c3.radius);
        System.out.println("c4.radius = "+c4.radius);
        
    }
}

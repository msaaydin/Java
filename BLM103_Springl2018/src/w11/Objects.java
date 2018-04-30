/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w11;

/**
 *
 * @author Erebor
 */
public class Objects {

    public static void main(String[] args) {
        Person p = new Person(32, "Musa aydın", "Comp. Eng");
        System.out.println("yaşım =" + p.age);
        Person p2 = new Person(19, "Ubeydullah", "BioMedikill");
        Person p3 = p2;
        Person p4 = p;
        Person p5 = p4;
        System.out.println(p3.department);
        p.age = 35;
        System.out.println(p5.age);
        p.name = "ali veli";
        System.out.println(p2.department);
        p5.age++;
        System.out.println(p.age);
        System.out.println(p5.hashCode());
        System.out.println(p.hashCode());
        System.out.println(p4.hashCode());
        
        System.out.println(p3.hashCode());
        System.out.println(p2.hashCode());
        
        
    }
}

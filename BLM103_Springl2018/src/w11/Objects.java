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
import java.lang.Math;
        
public class Objects {

    public static void main(String[] m) {
        Person p = new Person(32, "Musa aydın", "Comp. Eng");
        p.m_print();
        System.out.println(p.hashCode());
        p.foo(p);
        System.out.println("**************");
        p.m_print();
        Person [] arrayPerson = new Person[4];
        arrayPerson[0] = new Person(12 ,"ahmet", "com");
        arrayPerson[1] = new Person(35 ,"fatih", "eee");
        arrayPerson[2] = new Person(67 ,"veli", "bayo");
        arrayPerson[3] = new Person(78 ,"selin", "tr");
        for (int i = 0; i < arrayPerson.length; i++) {
            System.out.println(i+". person = ");
            arrayPerson[i].m_print();
            System.out.println("hash  cde = "+arrayPerson[i].hashCode());
           
        }
        
        
            
        
                
        
        
        
        
    }
}

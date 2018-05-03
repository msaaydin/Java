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
public class Person {
    int age;
    String name,department;
    static long id;
    public Person(int age, String name, String department) {
        this.age = age;
        this.name = name;
        this.department = department;
        this.id = 12;
    }
    public Person(){
        System.out.println("ben bir person class'ıyım yeni oluştum....");
    }   
    public void m_print(){
        System.out.println("adi = "+this.name);
        System.out.println("age = "+this.age);
        System.out.println("department = "+this.department);
        
        
    }
    public void foo(Person p2){
        System.out.println(p2.hashCode());
        p2.age += 10;
        p2.name = "ali veli";
        p2.department = "bayomedikil..";
                
    }
    
}

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

    public Person(int age, String name, String department) {
        this.age = age;
        this.name = name;
        this.department = department;
    }
    public Person(){
        System.out.println("ben bir person class'ıyım yeni oluştum....");
    }   
    
}

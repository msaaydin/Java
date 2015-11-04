/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Beyza Karabul
 * @param <E>
 */
public class Node <E>{
    E data;
    Node next;
    
    Node(E data){
        this.data = data;
    }
}

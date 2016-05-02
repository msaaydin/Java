/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

/**
 *
 * @author rivendell
 * @param <T>
 */
public class FindMax<T extends Comparable<T>> {
 
    T maxElement(T[] array){
        
        T max = array[0]; 
        for(int i = 1; i < array.length; i++){
            if ( array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
            
        return max;
    }
 
     
}

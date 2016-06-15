/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author rivendell
 */
public class HashTable {
    
    
   private int[] arr;
   private int capacity;
    
    public HashTable(int capacity){
        this.capacity = capacity;
        arr = new int[this.capacity];

    }
    
    public void insert(int ele)
    {
        arr[ele % capacity] = ele;
    }
    
    public void clear()
    {
        arr = new int[capacity];
    }
    
    public boolean contains(int ele)
    {
        return arr[ele % capacity] == ele;
    }
    
    public void delete(int ele)
    {
        if (arr[ele % capacity] == ele)
            arr[ele % capacity] = 0;
        else
            System.out.println("\nError : Element not found\n");
    }
    
    public void printTable()
    {
        System.out.print("\nHash Table = ");
        for (int i = 0; i < capacity; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }
    
}

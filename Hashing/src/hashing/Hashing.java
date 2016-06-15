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
public class Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashTable tbl = new HashTable(10);
        
        tbl.insert(345);
        tbl.insert(3);
        tbl.insert(58);
        tbl.insert(34);
        tbl.insert(6889);
        tbl.insert(12);        
        tbl.printTable();
        
        
    }
    
}

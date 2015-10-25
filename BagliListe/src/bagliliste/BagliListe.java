/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagliliste;

/**
 *
 * @author MSa
 */
public class BagliListe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bliste lst1 = new Bliste(12);
        lst1.addElementFront(45);
        lst1.addElementFront(6523);
        lst1.addElementFront(623);
        lst1.addElementFront(98);
        lst1.addElementFront(4);
        lst1.printList();      
        
    }
    
}

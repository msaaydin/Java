/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaptreeex;

/**
 *
 * @author rivendell
 */
public class HeapTreeEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BinaryMinHeap h = new BinaryMinHeap(10);
      h.insert(234);
      h.insert(65);
      h.insert(24);
      h.insert(59);
      h.insert(5);
      h.insert(2355554);
      h.insert(2344);
      h.removeMin();
      System.out.println(h.getMinimum());
      
     
    }
    
}

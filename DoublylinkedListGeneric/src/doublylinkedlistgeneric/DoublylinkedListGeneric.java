/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlistgeneric;

/**
 *
 * @author MSa
 */
public class DoublylinkedListGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<String> lst1 = new DoublyLinkedList<String>();
        
        lst1.addFirst("ahmet");
        lst1.addFirst("mehmet");
        lst1.addLast("alii");
        lst1.addLast("veliii");
        lst1.addLast("last item");
        lst1.printList();
        System.out.println("List size is..:"+lst1.sizeList());
    }
    
}

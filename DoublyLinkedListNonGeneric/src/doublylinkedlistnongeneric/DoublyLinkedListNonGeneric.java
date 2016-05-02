/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlistnongeneric;

/**
 *
 * @author MSa
 */
public class DoublyLinkedListNonGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int r1 = 0xbc89afed; 
        int r2 = 0x18;       
        // sonuç r3 = 0x18898BE5
        int r3 = r1 ^ r2;            
        String hex = Integer.toHexString(r3);        
        
        System.out.println("and sonucu r3 =0x"+hex.toUpperCase());
        //0xBCADAFFD
       // 0xbc89aff5
       
       int kucuk_c = 'e';
       int and_maskesi = 0xdf;
       int buyuk_C = kucuk_c & and_maskesi;
       
        System.out.println("buyuk C =0x"+Integer.toHexString(buyuk_C));
       
       int kucuk_k = 'k';
       int buyuk_K  = kucuk_k - 0x20;
        System.out.println("Buyuk_K =0x"+Integer.toHexString(buyuk_K));       
    }
    
}

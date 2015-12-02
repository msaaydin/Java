

package hastable_example;


public class ListHashTable {
    
    LinkedList [] table;
    
    ListHashTable(int size){
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList();
        }
    }
    
    void put(int key, String value){        
        String temp = String.valueOf(key);
        temp = temp.substring(1,3) + temp.substring(5, 7);
        int hash = Integer.parseInt(temp);
        hash = hash % table.length;
        Node t = table[hash].head;
        while(t != null && t.key != key)
            t = t.next;
        if(t == null)
            table[hash].addFirst(key, value);
        else
            t.value = value;
    }
    
    String get(int key){
        
        String temp = String.valueOf(key);
        temp = temp.substring(1,3) + temp.substring(5, 7);
        int hash = Integer.parseInt(temp);
        hash = hash % table.length;
        
        String bulunan = "tabloda bulunamadı";
        Node current = table[hash].head;
        while( current != null){
            if( current.key == key){
                bulunan = current.value;
                break;
            }
            current = current.next;
        }
        return bulunan;
    }
    
    void printTable(){
        
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            table[i].printList();
            System.out.println("");
            
        }
    }
    
    
    public static void main(String[] args) {
        
        ListHashTable table = new ListHashTable(10);
        table.put(1285299985, "Ali");
        table.put(129666684, "Veli");
        table.put(75153488, "Hasan");
        table.put(356566565, "Mehmet");
        table.put(33443432, "Furkan");
        table.put(12123334, "Hüseyin");
        table.put(69894264, "ahmet");
        table.printTable();
        System.out.println("aranan: " + table.get(1212343334));
    }
    
    
    class LinkedList{
        Node head;
        
        void addFirst(int key, String value){
            Node n = new Node(key, value);
            n.next = head;
            head = n;
        }
        
       Node removeFirst(){
          
            Node temp = head;
            head = head.next;
            return temp;   
       }
       
       void printList(){
           Node temp = head;
           while( temp != null){
               System.out.print( "[" + temp.key + " : " + temp.value + "] -> ");
               temp = temp.next;
           }
       }
    }    
    class Node{
        int key;
        String value;
        Node next;
        
        Node(int key, String value){
            this.key = key;
            this.value = value;
        }
    }
}


package hastable_example;

public class HashTable {
   
      private int TABLE_SIZE;
      HashEntry[] table;

      HashTable(int TABLE_SIZE) {
            table = new HashEntry[TABLE_SIZE];
            this.TABLE_SIZE = TABLE_SIZE;
            for (int i = 0; i < TABLE_SIZE; i++)
                  table[i] = null;
      }

      public int get(int key) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % TABLE_SIZE;
            if (table[hash] == null)
                  return -1;
            else
                  return table[hash].getValue();

      }
      public void put(int key, int value) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % TABLE_SIZE;
            table[hash] = new HashEntry(key, value);
      }
       void printTable(){
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            if( table[i] != null)
                System.out.println( table[i].getKey() + " : " 
                        + table[i].getValue());
            else
                System.out.println("");
        }
    }
      public static void main(String[] args) {
        HashTable table = new HashTable(128);
        table.put(123456789, 25);
        table.put(456655656, 55);
        table.put(565767887, 95);
        table.put(123456789, 1155);
        table.put(565767887, 4);
        table.printTable();
        System.out.println("aranan: " + table.get(123353455));
    }
    
    
}
class HashEntry {

      private int key;
      private int value; 

      HashEntry(int key, int value) {
            this.key = key;
            this.value = value;
      }      
      public int getKey() {
            return key;
      }
     public int getValue() {
            return value;

      }

}

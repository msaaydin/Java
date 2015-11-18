
package midtermreversingwordstack;


public class LinkedListStack <E>{
    LinkedList<E> list = new LinkedList<>();
    int size;

    void push(E data) {
        list.addFirst(data);
        size++;
    }
    E pop() {
     
            size--;
            return (E) list.removeFirst().data;
       
    }
    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
    void print()
    {
        list.printList();
    }
   

    public static void main(String[] args) {

        LinkedListStack<Character> s = new LinkedListStack<Character>();
        
        String word = "Hello",word2 = "";
        for (int i = 0; i < word.length(); i++) {
            s.push(word.charAt(i));
        }
        
        for (int i = 0; i < word.length(); i++) {
            word2 += s.pop();
        }
       
        System.out.println("Orjinal kelime..:"+word);
        System.out.println("Stack kullanılarak tersine çevrilmiş kelime..:"+word2);
        
        
      
    }
}

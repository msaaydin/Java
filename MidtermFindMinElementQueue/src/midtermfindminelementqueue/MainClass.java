
package midtermfindminelementqueue;


public class MainClass {
    
     public static void main(String[] args) {
        try {
            LinkedListQueue kuyruk = new LinkedListQueue();
            kuyruk.enqueue(-1);
            kuyruk.enqueue(24);
            kuyruk.enqueue(43);   
            kuyruk.enqueue(-8813);
            kuyruk.enqueue(3);
            kuyruk.enqueue(323);
            kuyruk.enqueue(22);
            kuyruk.enqueue(-155);
            int min = (int)kuyruk.dequeue();
            int length = kuyruk.size;
            for (int i = 0; i < length; i++) {
                int temp = (int)kuyruk.dequeue();
                if(min > temp){
                    min = temp;
                }
            }
            
            System.out.println("Minumum elemet...:"+min);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

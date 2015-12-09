
package recursive_test;


public class Recursive_test {

   
     static int topla (int sayi){
     
        if (sayi < 1)
            return 0;
        return sayi + topla(sayi - 1);
        
        
    }
        public static void print (Node l)
        {
          if (l == null)
            return;
          else {
            System.out.print(l.data+ " ->");
            print(l.next);
          }
        }
     public static int sumNodes(Node n, int sum){
         if (n == null)
             return 0;
         else{
             sum  = n.data;
            // return n.data + sumNodes(n.next);
            return sum + sumNodes(n.next, sum);
         }
     }
     public static int length (Node n)
     {
        if (n == null)
          return 0;
        else
          return 1 + length(n.next);
     }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(topla(4));
        Bliste lst1 = new Bliste(12);
        lst1.addElementFront(45);
        lst1.addElementFront(6523);        
        lst1.addElementFront(623);
        lst1.addElementFront(98);
        lst1.addElementFront(4); 
        print(lst1.head);
        System.out.println("*******************");
        int sum=0;
        System.out.println("toplam non recursive...:"+lst1.sum());
        System.out.println("toplam recursive "+sumNodes(lst1.head, sum));
        System.out.println("size of list non recursive ..:"+lst1.count());
        System.out.println("Size of list recursive......"+ length(lst1.head));
        //lst1.printList();      

    }
    
}

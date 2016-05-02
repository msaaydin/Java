
package bst;


public class BST {

    /**
     * @param args the command line arguments
     */
    static int leng(String word){
        if (word.equals(""))
            return 0;
        else 
            return 1+leng(word.substring(1));
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree tree = new BinarySearchTree();
       
        
        /*tree.insertRecursive(tree.root, 260);
        tree.insertRecursive(tree.root, 80);
        tree.insertRecursive(tree.root, 295);
        tree.insertRecursive(tree.root, 150);
        tree.insertRecursive(tree.root, 280);*/
        
        System.out.println("");
        tree.insert(260);
        tree.insert(80);
        tree.insert(95);
        tree.insert(250);
        tree.insert(290);
        tree.insert(110);
        tree.insert(355);
        tree.insert(76);
        tree.insert(90);
        tree.insert(275);
        System.out.println("max eleman...:"+tree.findMaxIterative());
        System.out.println("ful nodes number"+ tree.findFull(tree.root));
        tree.preorder(tree.root);
        System.out.println("toplam.:"+tree.fnc(tree.root));
        
        //tree.insert(tree.root, 26);
        //tree.insert(tree.root, 64);
        
        /*tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(10);
        tree.insert(18);
        tree.insert(16);
        tree.insert(19);
        tree.insert(9);
        tree.insert(8);
        tree.insert(30);
        tree.insert(29);
        tree.insert(46);
        tree.insert(11);   */    
       
        
        
      /*  System.out.println("maximum değer...:"+tree.findMaxRecursive(tree.root).item);
        System.out.println("maximum değer...:"+tree.findMaxIterative());
        System.out.println("string uzunluğu...:"+leng("musa aydın"));
        String s1 = "musa aydın";
        String s2 = s1.substring(2);
        System.out.println(s2);*/
        
        
        
    }
    
}

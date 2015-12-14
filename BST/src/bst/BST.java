
package bst;


public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
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
        tree.insert(11);       
        System.out.println("Total leaf number...:"+tree.LeafCount(tree.root));        
        
        
        
        
    }
    
}

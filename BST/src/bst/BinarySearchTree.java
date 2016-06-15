
package bst;

public class BinarySearchTree {
       private int level = 1;
       Node root;
        int getLevel(){
            return level;
        }
        public BinarySearchTree()
        { 
            root = null; 
        }
        public Node find(int val)
        {
            Node current = root;
            while(current.item != val)
            {
                level++;
                if(val < current.item)
                    current = current.leftChild;
                else
                    current = current.rightChild;
                if(current == null)
                    return null;
            }
            return current;
        }
       /* public int findSibling(int data){
       
               
        }*/
        public double fnc(Node head){
            double var1,var2,var3;
            if(head == null){
                var1 = 0;
                return var1;
            }
            else {
                var2 = fnc(head.leftChild);
                var3 = fnc(head.rightChild);
                var1 = head.item + var2 + var3;
                return var1;
            }
        }
        public void insert(int id)
        {    
            
            Node newNode = new Node();
            newNode.item = id;
            if(root==null)
                root = newNode;
            else
            {
                Node current = root;
                Node parent;
                while(true)
                {
                    parent = current;
                    if(id < current.item)
                    {
                        current = current.leftChild;
                        if(current == null)
                        {
                            parent.leftChild = newNode;
                            return;
                        }
                    } 
                    else
                    {
                        current = current.rightChild;
                        if(current == null) 
                        {
                            parent.rightChild = newNode;
                            return;
                        }
                    } 
                } 
            } 
        }
        // insert recursive
          public Node insertRecursive (Node r, int item)
          {
            if (r == null)
            {
                Node n = new Node();
                n.item = item;
                root = n;
                return n;
            }             
            else {
              if (item < r.item)
                 r.leftChild  = insertRecursive(r.leftChild, item);
              else
                 r.rightChild = insertRecursive(r.rightChild,item);
              return r;
            }
          }
        
         public Node findMaxRecursive(Node max){
            
             if(max.rightChild == null){
                 return max;
             }
             return findMaxRecursive(max.rightChild);
         }
         
         public int findMaxIterative(){
            Node temp = root;
            while(temp.rightChild != null){
                temp = temp.rightChild;
            }
                    
            return temp.item;
         }
        
        public boolean delete(int val) 
        {
            Node current = root;
            Node parent = root;
            boolean isLeftChild = true;
            while(current.item != val)
            {
                parent = current;
                if(val < current.item)
                {   
                    isLeftChild = true;
                    current = current.leftChild;
                }
                else
                {
                    isLeftChild = false;
                    current = current.rightChild;
                }
                if(current == null)
                    return false;

            } 
            if(current.leftChild==null && current.rightChild==null)
            {
                if(current == root)
                    root = null;
                else if(isLeftChild)
                    parent.leftChild = null;
                else
                    parent.rightChild = null;
            }
            else if(current.rightChild==null)
            {
                if(current == root)
                    root = current.leftChild;
                else if(isLeftChild)
                    parent.leftChild = current.leftChild;
                else
                    parent.rightChild = current.leftChild;
            }
            else if(current.leftChild==null)
            {
                if(current == root)
                    root = current.rightChild;
                else if(isLeftChild)
                    parent.leftChild = current.rightChild;
                else
                    parent.rightChild = current.rightChild;
            }
            else
            {
                Node successor = findSuccessor(current);
                if(current == root)
                    root = successor;
                else if(isLeftChild)
                    parent.leftChild = successor;
                else
                    parent.rightChild = successor;
                successor.leftChild = current.leftChild;
            } 
            return true;
        }
        int getMinValue(){
            Node current  = root;
            if (current == null){
                
                System.out.println("Tree is empty");
                return -9999999;
            }
            else
            {
                while(current.leftChild != null){
                     current = current.leftChild; 
                }
                return current.item;
            }
            
        }
        public Node findMaxValueRecursive(Node max){
            
             if(max.rightChild == null){
                 return max;
             }
             return findMaxRecursive(max.rightChild);
         }
                
        
        private Node findSuccessor(Node delNode)
        {
            Node successorParent = delNode; 
            Node successor = delNode;
            Node current = delNode.rightChild;
            while(current != null)
            {
                successorParent = successor;    
                successor = current;
                current = current.leftChild;
            }
            if(successor != delNode.rightChild)
            {
                successorParent.leftChild = successor.rightChild;
                successor.rightChild = delNode.rightChild;
            }
            return successor;
        }    
     public int LeafCount(Node node)  
     {  
       if(node == null)        
         return 0; 
       if(node.leftChild ==null && node.rightChild==null)       
         return 1;
       else  
         return LeafCount(node.leftChild)+ LeafCount(node.rightChild);       
     } 
       int sayac = 0;
     public int findFull(Node node){
      
        root = node;
         if(node == null)
             return 0;
         if (node.leftChild !=null && node.rightChild != null){
             sayac++;
             return sayac;
         }             
         else
             return findFull(node.leftChild) + findFull(node.rightChild);         
                
     }
     public void display(Node n)
    {
        if(n==null)
            return;
        display(n.leftChild);
        System.out.print(n.item+"\t");
        display(n.rightChild);
    }
     
    
     public void postorder(Node r)
     {
         if (r != null)
         {
             postorder(r.leftChild);             
             postorder(r.rightChild);
             System.out.print(r.item +" ");
         }
     }
     public void preorder(Node r)
     {
         if (r != null)
         {
             System.out.print(r.item +" ");
             preorder(r.leftChild);             
             preorder(r.rightChild);
         }
     }   
     
     public void inorder(Node r)
     {
         if (r != null)
         {
             inorder(r.leftChild);
             System.out.print(r.item +" ");
             inorder(r.rightChild);
         }
     }
        
}

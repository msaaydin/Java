/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author rivendell
 */
public class BinarySearchTree {
 
       Node root;
        public BinarySearchTree()
        { 
            root = null; 
        }
        public Node find(int val)
        {
            Node current = root;
            while(current.item != val)
            {
                if(val < current.item)
                    current = current.leftChild;
                else
                    current = current.rightChild;
                if(current == null)
                    return null;
            }
            return current;
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

        
}

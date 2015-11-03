/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author BÜŞRA BAŞ
 */
public class LinkedList<T> {
    
    Node<T> head = null;

    public LinkedList() {
        head = null;
    }

    public LinkedList(T data) {
        head = new Node<T>();
        head.data = data;
        head.next = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

   
    public void addLastElement(T data) {

        if (head == null) {
            
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            head = newNode;

        } else {

            Node newNode = new Node();
            newNode.data = data;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    Node removeAt(int position) {
        
        Node temp = head;
        if (position == 0) {
            head = head.next;
        } else {

            Node temp1 = temp;
            for (int i = 0; i < position - 1; i++) {
                temp1 = temp1.next;
            }
            temp1.next = temp1.next.next;
        }
        return null;
    }

}

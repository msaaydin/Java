/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Beyza Karabul
 * @param <E>
 */
public class LinkedList <E>{
    Node head;

    void addFirst(E data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    Node removeFirst() {
        Node temp = head;
        if (head != null) {
            head = head.next;
        }
        return temp;
    }

    void printList() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }
}

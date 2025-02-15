import java.util.*;

public class Reverse_LL_With_ExtraLL{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // Constructor
    public Reverse_LL_With_ExtraLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list using an extra linked list
    public Reverse_LL_With_ExtraLL reverseWithExtraList() {
        Reverse_LL_With_ExtraLL newLinkedList = new Reverse_LL_With_ExtraLL(); 
        Node current = this.head; 

        while (current != null) {
            newLinkedList.addFirst(current.data);
            current = current.next; 
        }

        return newLinkedList;
    }

    public static void main(String[] args) {
        Reverse_LL_With_ExtraLL ll = new Reverse_LL_With_ExtraLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println("Original Linked List:");
        ll.print();

        Reverse_LL_With_ExtraLL reversedList = ll.reverseWithExtraList();
        System.out.println("Reversed Linked List:");
        reversedList.print();
    }
}

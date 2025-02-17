public class LinkedListReverse {

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public  Node head; 
    public  Node tail;
    public static int size;  

    // Method to reverse the list into a new list
    public void reverseToNewList(LinkedListReverse reversedList) {
        Node current = head;

        while (current != null) {
            reversedList.addFirst(current.data);
            current = current.next;
        }
    }

    // Find the length of the list
    public int getLength() {
        return size;
    }

    // Add a node at the end of the list
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

    // Add a node at the beginning of the list
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

    // Print the linked list
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListReverse list1 = new LinkedListReverse();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(7);
        
        System.out.println("Original list:");
        list1.print();

        LinkedListReverse reversedList = new LinkedListReverse();
        System.out.println("Reversed list (initially empty):");
        reversedList.print();

        list1.reverseToNewList(reversedList);
        System.out.println("Reversed list (after reversing):");
        reversedList.print();
    }
}

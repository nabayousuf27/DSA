public class LinkedListMidNode {
    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Head of the linked list
    public static Node tail; // Tail of the linked list
    public static int size;  // Size of the linked list

    // Find the Length of the  List
    public int getLength() {
        return size;
    }

    // Print the middle element of the linked list
    public void printMiddle() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        for (int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
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

   
    public static void main(String[] args) {
        LinkedListMidNode list1 = new LinkedListMidNode();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(100);
        list1.addLast(4);
        list1.addLast(9);
        list1.printMiddle();
    }
}


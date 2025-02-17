public class LinkedListLength {
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
        LinkedListLength list1 = new LinkedListLength();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(5);
        System.out.println("Length of List 1: " + list1.getLength());
       

     }
}


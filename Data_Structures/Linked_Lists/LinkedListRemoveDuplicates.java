public class LinkedListRemoveDuplicates{

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; // Head of the linked list
    public Node tail; // Tail of the linked list
    public int size;  // Size of the linked list

    // Find the Length of the List
    public int getLength() {
        return size;
    }

    
    // Add a node to the end of the list
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

    
    public LinkedListRemoveDuplicates removeDuplicates() {
        LinkedListRemoveDuplicates removed_Duplicates = new LinkedListRemoveDuplicates();
        Node temp = this.head; // Start from the head of the original list
        if (temp != null) {
            removed_Duplicates.addLast(temp.data); // Add the first element
            
            while (temp != null && temp.next != null) {
                // Check if the current node is a duplicate of the next node
                if (temp.data != temp.next.data) {
                    removed_Duplicates.addLast(temp.next.data); // Add non-duplicate nodes
                }
                temp = temp.next; // Move to the next node
            }
        }
        return removed_Duplicates; // Return the new list
    }
    

    // Print the linked list
    public void printList() {
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
        // Original list
        LinkedListRemoveDuplicates list1 = new LinkedListRemoveDuplicates();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(6);
        list1.addLast(7);

        System.out.println("Original List:");
        list1.printList();

        // Create a copy of the list
        LinkedListRemoveDuplicates removed_Duplicates = list1.removeDuplicates();

        System.out.println("removed copy elements in List:");
        removed_Duplicates.printList();
    }
}

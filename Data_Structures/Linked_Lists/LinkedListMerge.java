public class LinkedListMerge {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    // Add node to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Merge two sorted linked lists
    public Node mergeSortedLists(Node list1, Node list2) {
        Node dummy = new Node(0); // Dummy node to hold the result
        Node current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, add them
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // Return the merged list
    }

    // Print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListMerge list1 = new LinkedListMerge();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);

        LinkedListMerge list2 = new LinkedListMerge();
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);

        System.out.println("List 1:");
        list1.printList(list1.head);

        System.out.println("List 2:");
        list2.printList(list2.head);

        LinkedListMerge mergedList = new LinkedListMerge();
        Node mergedHead = mergedList.mergeSortedLists(list1.head, list2.head);
        
        System.out.println("Merged List:");
        mergedList.printList(mergedHead);
    }
}

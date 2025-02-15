class CircularLinkedList{
    static class Node {
        int data;
        Node next;
    }

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
            
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;
        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;
                if (p == last)
                    last = newNode;
                return last;
            }
            p = p.next;
        } while (p != last.next);
        System.out.println("The given node " + item + " is not present in the list");
        return last;
    }

    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;

       if (last.data == key && last.next == last) {
            return null;
        }

        Node temp = last, prev = null;

        if (last.next.data == key) {
            temp = last.next;
            last.next = temp.next;
            return last;
        }

        do {
            prev = temp;
            temp = temp.next;
        } while (temp != last && temp.data != key);

        
        if (temp.data == key) {
            prev.next = temp.next;
            if (temp == last) 
            last = prev;
        }
        return last;
    }

    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);
        
        traverse(last);

        last = deleteNode(last, 8); 

        traverse(last);
    }
}

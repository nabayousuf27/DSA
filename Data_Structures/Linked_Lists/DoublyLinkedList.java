import java.util.*; 
public class DoublyLinkedList{
    public  class Node{
        int data;
        Node next;
        Node prev;

        //constructor
        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev = null; 
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 
    
    //methods
    public void addFirst(int data){
        Node n1 = new Node(data);
        size++;
        if(head == null){
            head = tail = n1;
            return;
        }
        n1.next=head;
        head.prev = n1;
        head = n1;
    }
    public void addLast(int data){
        Node n1 = new Node(data);
        size++;
        if(head == null){
            head = tail = n1;
            return;
        }
        tail.next=n1;
        n1.next = null;
        n1.prev = tail;
        tail=n1;
    }
    public int revomeFirst(){
        if(head == null){
            System.out.println("empty ");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null ;
            size-- ;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public void print(){//haed already hai so no need to pass any parameter
        if(head == null){
        System.out.println("link list is empy");
        return;
       }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
      
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.print();
        dll.revomeFirst();
        dll.print();
        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);
    }
}

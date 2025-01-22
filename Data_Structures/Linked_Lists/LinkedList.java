public class LinkedList{
    public static class Node{
        int data;
        Node next;
        //constructor
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head; //class k andar as a static property because evrtytime it will remains the same
    public static Node tail;
    public static int size; //by deafult zero by java
    //methods
    public void addFirst(int data){
        Node n1 = new Node(data);
        size++;
        if(head == null){
            head = tail = n1;
            return;
        }
        n1.next=head;
        head=n1;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){ //if the list is empy
            head= tail= newNode;
            return;
        } 
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){//haed already hai so no need to pass any parameter
        if(head == null){
        System.out.println("link list is empy");
        return;
       }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //adds at specific index
    public void add(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i =0 ;
        while(i <  index- 1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){   //head already hai hamre pass
        if(size==0){ //linked list is empty so nothing is their to be deleted
            System.out.println("linklist is empty");
            return Integer.MAX_VALUE;  //will return - infinty not a valid value
        }
        else if(size == 1){ //head and tail both are same , so we need to change both
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

            int val = head.data; //going to delete this value
            head = head.next;
            size--;
            return val;
        }
        public int removeLast() {
            if(size == 0){ //link list is empty
                System.out.println("linlist is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
           Node prev =  head;
           for(int i = 0 ; i<size-2 ;i++){
             prev= prev.next;
            }
            int val = prev.next.data; //tail.data
            prev.next = null;
            tail = prev;
            size--;
            return val;
         
        }
        public int itrSearch(int key){
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == key){
                    return i;
                }
                i++;
                temp = temp.next;
            }
            //key not found
            return -1;
        }
        public void deleteNthFromEnd(int n){
            //calculate size
            int size = 0 ;
            Node temp = head ;
            while (temp != null){
                temp = temp.next;
                size++;
            }
            if(n == size){
                head = head.next; //remove first
                return ;
            }
            //size - n
            int i = 0;
            int itofind = size-2;
            Node prev = head;
            while(i< itofind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }
    //  public void reverse(){ //without using anither linked list
    //    Node current ;
    //    Node  previous ;
    //    Node  next;
    //  }
     public void reverseWithExtraList(LinkedListAll reversedList) {
        Node current = head; // Start from the original list's head
    
        while (current != null) {
            reversedList.addFirst(current.data); // Add each element to the beginning of the passed-in list
            current = current.next; // Move to the next node
        }
    }
       
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
      
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        ll.removeLast();
        System.out.println("this should be one :");
        ll.print();
    }
}

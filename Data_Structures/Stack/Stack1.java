package Data_Structures.Stack;
//stack implementation using linked list

public class Stack1{
public static void main(String[] args) {
    StackA s = new StackA();
    s.push(1);
    s.push(2);
    s.push(3);
    while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
}
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackA{
        public Node head = null;

        public  boolean isEmpty(){
            return head == null;
        }
        //push
        public  void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head = newNode;
        }
    
        //pop
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek
        public  int peek(){
            if( isEmpty()){
                return -1;
            }
            return head.data;
        }
        // print stack
        public void print() {
            while (!isEmpty()) {
                System.out.println(peek());
                pop();
            }
        }
}



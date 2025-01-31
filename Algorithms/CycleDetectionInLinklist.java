//Floy's Cycle Finding algorithm
public class CycleDetectionInLinklist {

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

        //methods
        public static  boolean  isCycle(){  
            Node slow = head;
            Node fast= head;
            while(fast != null && fast.next != null){
                slow = slow.next;        // +1 move
                fast = fast.next.next ;  //+2 move
                if(slow == fast){
                    return true;      //cycle exist
                }
            }
            return false; //cycle does not exist
        }

        public static void removeCycle(){
            //detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;      // to track if cycle exist
            while(fast != null && fast.next != null){
                slow = slow.next;        // +1 move
                fast = fast.next.next ;  //+2 move
                if(slow == fast){
                    cycle = true;
                    break;        //exist now find the meeting point
                }
            }
            if(cycle == false){
                return;
            }

           // find meeting point 
            
            slow = head;
            Node prev = null;   //last node will be stord
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast =fast.next;
            }
            prev.next = null;        //remove cycle -> last.next = null
        }
        public static void main(String[] args) {
            head = new Node(1);
            Node temp = new Node(2);
            head.next = temp;
            head.next.next = new Node(3);
            head.next.next.next = temp;
            // 1->2->3->2
            System.out.println(isCycle());

            removeCycle();
            System.out.println(isCycle());
        }
    } 
    
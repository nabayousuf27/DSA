//Queue implentation using Array

public class QueueB{
    static class Queue{
        static int arr[];
        static int size ;
        static int rear;
        //contructor
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1; //nothing is stored in queue cause initialized value is being returned
        }
        //add //enqueue
        public static void add(int data){
            if(rear == size-1) { //last index
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear]=data;
        }

        //remove //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            //shifiting the indices after removeing first
            //front will always be zero index but elements will be shifted
            for(int i =0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }

    }
}

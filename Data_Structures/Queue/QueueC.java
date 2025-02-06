package Data_Structures.Queue;

//Queue implentation using circular Array

public class QueueC{
    //to implement queue using in main so static 
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        //contructor
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1; 
        }
        
        public static boolean isFull(){
             return (rear+1) % size == front; 
        }

        //add //enqueue
        public static void add(int data){
            if(isFull()) { 
                System.out.println("Queue is full");
                return;
            }
            //  adding first element
            if(front == -1){
                front = 0 ;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        //remove // dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            //last element remove
            if(rear == front ){
                rear = front = -1;
            } else {
                front = (front +1) % size;
            }
            return result;
        }
        
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
        //print
        public void print() {
            while (!isEmpty()) {
                System.out.println(peek());
                remove();
            }
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        q.print();
    }
}


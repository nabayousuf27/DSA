import java.util.Stack;

//queue using stack method 1

public class QueueS {
    static class Queue {
        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Add element (O(n))
        public void add(int data) {
           while(! s1.isEmpty()){
            s2.push(s1.pop());
           }
           s1.push(data);
           while(!s2.isEmpty()){
            s1.push(s2.pop());
           }
        }

        // Remove element (O(1)
        public int remove(){
           if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
           }
           return s1.pop();
        }

        // Get front element 0(1)
        public int peek() {
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
               }
               return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

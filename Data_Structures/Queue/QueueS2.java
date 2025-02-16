import java.util.Stack;
//queue using stack method 2

public class QueueS2{
    static class Queue {
        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Add element (O(1))
        public void add(int data) {
            s1.push(data);
        }

        // Remove element (O(n) worst-case, O(1) amortized)
        public int remove() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            if (s2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            return s2.pop();
        }

        // Get front element (O(n) worst-case, O(1) amortized)
        public int peek() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            if (s2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            return s2.peek();
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

import java.util.ArrayList;
// stack  implementation using arraylist

public class Stack {
    static class StackA{
        static ArrayList <Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;

        }
        //push
        public static void push(int data){
        list.add(data); //add the new data add the end so by this way it wil
        }
        //pop
        public static int pop(){ //delte kren se phele store kr lega taake we can show them
        if(isEmpty()){
            return -1;
        } 
        int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
        if(isEmpty()){
            return -1;
        }
         //return top
        return list.get(list.size()-1); 
        }

    }
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



import java.util.*;
import java.util.LinkedList;

public class HashMapCode {    // all hashmap code 
    //all the internal implemetation of map
    static class HashMap<K,V>{    //generic
        private class Node{
            K key ;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int size; //n 
        private LinkedList<Node> buckets[]; //N = buckets.length
        
        @SuppressWarnings("unchecked")
        //constructor
        public HashMap(){
            this.size=0; 
            this.buckets =new LinkedList[4];
            for(int i=0; i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
       
        public void put(K key , V value){
        }
        public Boolean containsKey(K key){
            return false;
        }
        public V remove(K key){
            return null;
        }
        public V get(K key){
            return null;
        }
        public ArrayList<K> keySet(){
            return null;
        }
    }
    public static void main(String[] args) {
    
    }
}

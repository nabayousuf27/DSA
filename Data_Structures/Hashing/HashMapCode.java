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
        private int n; //n //total number of nodes exist in my hashmap
        private int N; 
        private LinkedList<Node> buckets[]; //N = buckets.length //array
        
        @SuppressWarnings("unchecked")
        //constructor
        public HashMap(){
            this.N = 4;  //N array size i.e bucket size 
            this.buckets = new LinkedList[4];
            for(int i=0; i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N; //first absolute then modulo so that the index value should remain in the range of array size
            }
        public int SearchInLL(K key,int bi){ 
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i =0; i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2* N;
            for(int i = 0 ; i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            //nodes -> add in bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j =0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key , node.value);
                }
            }
        }
        // create this function now all above is given
        public void put(K key , V value){ //0(lamda) -> 0(1)
            int bi = hashFunction(key);  //index 0 to size-1; 0 to 3
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            
            double lamda = (double) n/N;
            if(lamda>2.0){ //treshhold value
                rehash();
            }

        }
        public Boolean containsKey(K key){ //0(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di != -1){ //valid
                return true;
            }
            else{
              return false;
            }
        }
        public V remove(K key){  //0(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != 1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }
        public V get(K key){
            //return the value of key where it exist
            int bi = hashFunction(key);  
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
               return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll ){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
            
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm =  new HashMap<>();
        
        hm.put("Nepal", 100);
        hm.put("US", 100);
        hm.put("China", 100);
        hm.put("Pakistan", 100);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }
        System.out.println(hm.get("US"));
        System.out.println(hm.remove("US"));
        System.out.println(hm.get("US"));
    }    
}

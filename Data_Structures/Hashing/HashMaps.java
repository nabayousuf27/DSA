import java.util.*;

public class HashMaps {
    public static void main(String args[]){
    //create hashmap
    HashMap<String,Integer> hm = new HashMap<>();

    //insert
    hm.put( "pakistan", 120);
    hm.put("Us",12);
    hm.put("UAE",180);
    System.out.println(hm);

    //get - 0(1) // to key the value of key
    int population = hm.get("pakistan");
    System.out.println(population);

    //contains - 0(1) return true/false
    System.out.println(hm.containsKey("pakistan")); //true
    System.out.println(hm.containsKey("India")); //false

    //remove  -0(1) //pakistan will removed and value will be returned
    System.out.println(hm.remove("pakistan"));
    System.out.println(hm);

    //Size
    System.out.println(hm.size());

    //Is Empty
    System.out.println(hm.isEmpty());

    //clear function
    hm.clear();
    System.out.println(hm.isEmpty());
    

}
}

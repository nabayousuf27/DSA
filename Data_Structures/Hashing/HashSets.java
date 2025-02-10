import java.util.*;

public class HashSets {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        //add elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);  // will not add beacuse they already exist in a set
        
        //print elements
        System.out.println(set);
        
        //remove elements
        set.remove(2);

        //check if element contains in a set
        if(set.contains(2)){
            System.out.println("set contains 2");
        } else {
            System.out.println("does not conatins 2");
        }

        System.out.println(set);

        //print size
        System.out.println(set.size());

        //clear set
        set.clear();

        //check if set is empty or not
        System.out.println(set.isEmpty()); //true or false 
    }
}

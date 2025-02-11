import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Karachi");
        cities.add("Peshawar");
        cities.add("Islamabad");
        cities.add("Rawalpindi");
        cities.add("Lahore");

        //using iterators
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //using advanced loop / for each loop
        for(String city : cities){
            System.out.println(city);
        }

    }
}

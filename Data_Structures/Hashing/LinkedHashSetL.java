
import java.util.*;
public class LinkedHashSetL{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("US");
        cities.add("Pakistan");
        cities.add("China");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("US");
        lhs.add("Pakistan");
        lhs.add("China");
        System.out.println(lhs);

        lhs.remove("US");
        System.out.println(lhs);

        
    }
}

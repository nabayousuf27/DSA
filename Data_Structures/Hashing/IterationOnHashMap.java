package Data_Structures.Hashing;
import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Pakistan" , 200);
        hm.put("China" , 210);
        hm.put("America" , 50);
        hm.put("Indonesia" , 600);
        hm.put("Nepal" , 100);

        //iterate

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + ",value = " + hm.get(k));
        }

        //entry set - hm.entrySet() - set of pairs will come
    }
}

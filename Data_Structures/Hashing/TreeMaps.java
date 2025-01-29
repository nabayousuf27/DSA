import java.util.*;
public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("US",80);
        tm.put("Pakistan" , 100);
        tm.put("China",50);

        System.out.println(tm);
    }
}
// output 
// {China=50, Pakistan=100, US=80}

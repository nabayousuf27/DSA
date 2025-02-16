import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

public class SumToTarget_Question {
    public static int[] twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> visited = new HashMap<>();
    for (int i=0;  i<arr.length; i++){
        int diff= target-arr[i];
        if (visited.containsKey(diff)){
            return new int[] { i, visited.get(diff)};
        }
        visited.put(arr[i],i);
    }
    return new int[]{0,0};
}

    public static void main(String[] args) {
        int[] arr={1,5,9,7};
        int target=8;
        int [] result= twoSum(arr, target);
        if (result!=null){
            System.out.println("Indices: ["+ result[0]+ " , "+ result[1]+ "]");
        }
        else {
            System.out.println("Not found");
        }
    }
    }

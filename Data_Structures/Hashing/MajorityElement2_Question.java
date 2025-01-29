import java.util.HashMap;
import java.util.*;
//optimized
public class MajorityElement2_Question {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int nums[]={1,3,2,5,1,3,1,5,1};

        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i], 0) + 1);
        }
        //for majority elements appear more than n/3
        for(Integer k : hm.keySet()){
            if (hm.get(k) > nums.length/3){
                System.out.println(k);
            }
        }
    }
}
   

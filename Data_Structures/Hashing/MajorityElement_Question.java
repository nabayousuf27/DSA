import java.util.HashMap;
import java.util.*;

public class MajorityElement_Question {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int nums[]={1,3,2,5,1,3,1,5,1};
        int n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(nums[i])){ 
                int addedValue = hm.get(nums[i]);  // or hm.get(arr[i]) +1 
                addedValue += 1;
                hm.put(nums[i],addedValue);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        System.out.println(hm);

        //for majority elements appear more than n/3
        Set<Integer> keys = hm.keySet();
        int max = n/3;
        for(Integer k : keys){
            if (hm.get(k) > max){
                System.out.println(k);
            }
        }
    }
}
   

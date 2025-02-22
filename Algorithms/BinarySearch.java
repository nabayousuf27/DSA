
public class BinarySearch {
    public static void main(String[] args) {

        int nums[] = {1,3,6,9,13};
        int target = 9;

        int result = binarySearch(nums, target);

        if (result != -1){
            System.out.println("Element found at index: " + result);                 
        } else {
            System.out.println("Element not found!");
        }       
        
    }

    public static int binarySearch(int[] nums, int target){
    
        int left = 0;
        int right = nums.length;

        while (left <= right) {
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return -1;
    }
}

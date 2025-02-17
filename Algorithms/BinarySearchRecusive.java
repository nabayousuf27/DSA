public class BinarySearchRecusive {
    public static int searchNum(int start,int end ,int target , int [] arr){
        
        //base case
        if (start > end) {
            return -1; // Element not found
        }

        int mid = (start + end) / 2 ;
        System.out.println("mid  " + mid);
        
        if(target == arr[mid]){
            return mid;
        }
        else if (target > arr[mid]){
            //search in right
            start = mid + 1;
            return searchNum(start, end ,target , arr);
        }
        else {
            //serach in left
            end = mid - 1 ;
            return  searchNum(start, end ,target,arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 9;
        int start = 0;
        int end = arr.length -1 ;
        System.out.println("the number is at index : " + searchNum(start,end,target,arr));
    }
}

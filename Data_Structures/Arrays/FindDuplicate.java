public class FindDuplicate {
    public static int findDuplicate(int[] arr) {

       int  n=arr.length;
       int totalsum=0;
       for (int num : arr ){
           totalsum += num;
       }
       
       int excpectedSum=(n-2)*(n-1)/2;
       return totalsum - excpectedSum ;

       }

    public static void main(String[] args) {
        int[]arr={0,2,3,1,4,5,3};
        int result = findDuplicate(arr);
        System.out.println("the duplicate is : " + result);

    }
}
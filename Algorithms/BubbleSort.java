import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        System.out.println("Elements before Sorting : ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Elements after Sorting : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]){
        for(int i =0; i<arr.length -1 ; i++){
            for(int j = 0 ;j<(arr.length-i-1);j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
}
import java.util.*;

public class ArrayCC {

    // Method to insert an element into an array
    public static int[] insertElement(int[] array, int index, int element) {
        // Create a new array with size +1
        int[] newArray = new int[array.length + 1];

        // Copy elements up to the insertion index
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element
        newArray[index] = element;

        // Copy remaining elements
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        // Return the new array
        return newArray;
    }

    // Method to find the largest number in an array
    public static int largestNumber(int arr[]) {
        int max = Integer.MIN_VALUE; // Initialize with the smallest possible value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to perform linear search for an integer
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index of the key
            }
        }
        return -1; // Key not found
    }

    // Method to perform linear search for a string
    public static int linearSearchString(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) { // Use equals() for string comparison
                return i;
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Example: Insert an element into an array
        int[] array = {1, 2, 3, 4, 5};
        int insertIndex = 2; // Position where the new element will be added
        int newElement = 99;  // Element to insert

        int[] newArray = insertElement(array, insertIndex, newElement);
        System.out.println("Array after insertion: " + Arrays.toString(newArray));

        // Example: Find the largest number in an array
        int arr[] = {1, 2, 6, 3, 5, 9};
        System.out.println("Largest number: " + largestNumber(arr));

        // Example: Linear search for an integer
        int key = 7;
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

        // Example: Linear search for a string
        String arr1[] = {"apple", "banana", "chickoo", "cherry"};
        String key1 = "banana";
        int index1 = linearSearchString(arr1, key1);
        if (index1 == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index1);
        }
    }
}

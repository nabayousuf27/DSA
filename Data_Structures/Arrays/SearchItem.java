import java.util.Scanner;

public class SearchItem {
    public static void search(int[] LA, int ITEM) {
        boolean found = false;
        for (int i = 0; i < LA.length; i++) {
            if (LA[i] == ITEM) {
                found = true;

                // Print two right neighbors
                if (i + 1 < LA.length) {
                    System.out.println("Right neighbor 1: " + LA[i + 1]);
                    if (i + 2 < LA.length) {
                        System.out.println("Right neighbor 2: " + LA[i + 2]);
                    } else {
                        System.out.println("No right neighbor.");
                    }
                } else {
                    System.out.println("No right neighbor.");
                }

                // Print two left neighbors
                if (i - 1 >= 0) {
                    System.out.println("Left neighbor 1: " + LA[i - 1]);
                    if (i - 2 >= 0) {
                        System.out.println("Left neighbor 2: " + LA[i - 2]);
                    } else {
                        System.out.println("No left neighbor.");
                    }
                } else {
                    System.out.println("No left neighbor.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] LA = {10, 20, 30, 40, 50, 60, 70}; // Example array
        System.out.print("Enter the ITEM to search: ");
        int ITEM = sc.nextInt();

        search(LA, ITEM);
    }
}

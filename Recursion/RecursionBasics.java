public class RecursionBasics {
    //print numbers in increasing order - 1st method by me
    public static void printInc(int s , int n){
        if(s==n){
            System.out.println(s + " ");
            return;
        }
        else{
            System.out.print(s + " ");
            printInc(s+1, n);
        }
    }
    //usual methods
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        else{
            printInc(n-1);
            System.out.print(n + " ");
        }
    }
    //print Number in decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    //factorial of a number
    public static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
   public static void main(String[] args) { 
    //for first method
    int s = 1;
    int n = 10 ;
    printInc(s ,n);
    //for second method
    int num=10;
    printInc(num);
    //factorial
    System.out.println("\nthe value of factorial is: " + fact(5));
    printDec(8);
}
} 


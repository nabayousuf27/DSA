public class RecursionBasics {
    //1st method by me
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
    //factorial of a number
    public static void fact(int n , int fact){
        //base case
        if(n==1){
            fact = fact*n;
            System.out.println("\nthe value of factorial is: " + fact);
            return;
        }
        else{
            fact = fact*n;
            fact(n-1 , fact);
        }
    }
   public static void main(String[] args) { 
    //first method
    int s = 1;
    int n = 10 ;
    printInc(s ,n);
    //second method
    int num=10;
    printInc(num);
    
    int fact=1;
    fact(5 , fact);
}
} 


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
   public static void main(String[] args) {
    //first method
    int s = 1;
    int n = 10 ;
    printInc(s ,n);
    //second method
    int num=10;
    printInc(num);
}
} 


public class TwoDMatrix {
    public static int sumOfLeftDiagonal(int matrix[][]){
        int sum=0;
        for(int i = 0 ;i <matrix.length ; i++){
            for (int j=i; j<matrix[0].length ; j++){
                sum=sum + matrix[i][i];
                 break;
             }
        }
        return sum;
    }
    //another way
    //     public static int sumOfLeftDiagonal(int matrix[][]){
    //     int sum=0;
    //     for(int i = 0 ;i <matrix.length ; i++){
    //         sum=sum + matrix[i][i];
    //        }
    //     return sum;
    // }
    public static int sumOfRightDiagonal(int matrix[][]){
        int sum=0;
        int length = matrix.length;
        for(int i = 0 ;i <matrix.length ; i++){
            for (int j=i; j <matrix[0].length ; j++){
                sum=sum + matrix[i][(length-1)-i];
                break;
            } 
        }
        return sum;
    }
    public static void transpose(int matrix[][]){

        int  newMatrix[][] = new int[3][3];
        for(int i=0; i < matrix.length ;i++){
            for(int j=0; j < matrix[0].length; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        // for printing
        //original matrix
        System.out.println("original matrix ");
        for(int i=0; i < matrix.length ;i++){
            for(int j=0; j < matrix[0].length; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //transpose
        System.out.println("transpose matrix ");

        for(int i=0; i < matrix.length ;i++){
            for(int j=0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       
    }
    public static void main(String[] args) {
        int  matrix[][] = {{2,3,4},{5,6,7},{8,9,10}};
        transpose(matrix);
        System.out.println("the sum of left DIaognal of matrix is : " + sumOfLeftDiagonal(matrix));
        int newMM[][]={{2,3,4,5},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("the sum of right DIaognal of matrix is : " + sumOfRightDiagonal(newMM));
    }
}

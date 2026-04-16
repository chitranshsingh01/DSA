package Array2D;

public class rotatematrix{
    public static void main(String[] args) {
         int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
         rotate(arr);
        //  int[][] ans=rotate(arr);
         //1,2,3        1,4,7               7,4,1
         //4,5,6    ->  2,5,8     ->        8,5,2  
         //7,8,9        3,6,9               9,6,3
        
    }
    public static void rotate(int[][] matrix) {

        for (int i =0; i <matrix.length; i++) {
            for (int j =0; j <=i; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        int i=0;
        int j=matrix.length-1;
        while(i<=j){
            for (int k = 0; k < matrix.length; k++) {
                int temp=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=temp;
            }
            i++;
            j--;
        }

         for (int o = 0; o<matrix.length; o++) {
        for (int p = 0; p < matrix[0].length; p++) {
            System.out.print(matrix[o][p]+" ");
    }
    System.out.println();
}   
    } 
}

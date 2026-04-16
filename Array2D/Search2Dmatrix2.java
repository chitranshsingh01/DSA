package Array2D;

public class Search2Dmatrix2 {
    public static void main(String[] args) {
        int [][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target =24;
        System.out.println(searchMatrix(matrix,target));

    }
     public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(j<matrix[0].length && j>=0 && i<matrix.length && i>=0){
            if(matrix[i][j]==target){   
                return true;    
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    
}

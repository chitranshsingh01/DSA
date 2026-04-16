package Array2D;
public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,34,5},{4,3,6,8},{7,43,2,7,24,745,99}};
        int target =99;
        boolean flag=false;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(matrix[i][j]==target){
                    // System.out.println("found");
                    flag=true;
                    break;
                }  
            } 
        }
        if(flag){
            System.out.println("found");
        }
        else{

            System.out.println("not found");
        }
        
    }
    
}

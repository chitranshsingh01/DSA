package Array2D;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
         List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int rigth=matrix[0].length-1;
        while(top<=bottom&&left<=rigth){
            for (int i = top; i <=rigth; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i <=bottom; i++) {
                list.add(matrix[i][rigth]);
            }
            rigth--;
            if(top<=bottom){
                
                for (int i =rigth; i >=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=rigth){

                for (int i = bottom; i >=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        for (int i : list) {
            System.out.print(i+" ");
        } 
    }  
    }

    
}

package Array2D;
import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows=5;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(numRows);
        for (int i = 0; i <numRows; i++) {
            ArrayList<Integer> row=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                
                row.add(j, 1);  
            }
            arr.add(row);
        }

        for (int i = 0; i <numRows; i++) {
            for (int j = 0; j <=i; j++) {
                if(i==j ||j==0){
                    arr.get(i).set(j,1);
                }
                else{
                    int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).set(j, val);
                }
            }
        }



        for (ArrayList<Integer> row : arr) {
            for (int i : row) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        
    }

    
}

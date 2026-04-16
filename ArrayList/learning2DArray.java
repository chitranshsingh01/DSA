package ArrayList;
import java.util.*;

public class learning2DArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> num= new ArrayList<>();
        System.out.println(num);
        num.add( new ArrayList<>());
        num.add(new ArrayList<>());
        num.get(0).set(0, 5);
        for ( ArrayList<Integer> list : num) {
            for (int i : list) {
                System.out.println(i+" ");  
            } 
        }



    //NEW 2D ARRAYLIST WITH CHARACTERS 1


         ArrayList<ArrayList<Integer>> arr=new ArrayList<>(5);
        for (int i = 0; i <5; i++) {
            ArrayList<Integer> row=new ArrayList<>();
            for (int j = 0; j <5; j++) {
                
                row.add(j, 1);  
            }
            arr.add(row);
        }
        for (ArrayList<Integer> row : arr) {
            for (int i : row) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

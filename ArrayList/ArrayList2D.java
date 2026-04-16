package ArrayList;
import java.util.ArrayList;

import Array.foreach;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        ArrayList<Integer> arr3= new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        System.out.println(arr);


        //FOREACH
        for (ArrayList<Integer> list : arr ) {
            for (int a : list) {
                System.out.print(a+" ");
                
            }
            System.out.println();
            
        }


    }
    
}

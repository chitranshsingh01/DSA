package Array;
import java.util.*;


public class copy {
    public static void main(String[] args) {
        
        int[] x={10,7,3,5,8};
        int[] arr=x;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
           
        }
      
        System.out.println();
        arr[1]=20;
        System.out.println(arr[1]);
        System.out.println(x[1]);
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int c=5;
        
        System.out.println(Math.pow(c,5));
        
        System.out.println(Arrays.binarySearch(arr, 20));
    }
    
}

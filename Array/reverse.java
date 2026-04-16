package Array;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int j=0;
        int[] nums=new int[n];
        for (int i = n-1; i >=0; i--) {
           
            nums[j]=arr[i];
            j++;
            
        }
        for (int i : nums) {
            System.out.print(i);
            
        }
    }
    
}

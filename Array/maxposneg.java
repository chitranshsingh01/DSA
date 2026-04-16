package Array;
import java.util.*;



public class maxposneg {
    public static void main(String[] args) {
        int[] nums={-3,-1,-6,-10,3,6,1,87,33};
          int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos++;
            }
            else if(nums[i]<0){
                neg++;
            }
        }
        Math.max(pos,neg);
    }
    
}

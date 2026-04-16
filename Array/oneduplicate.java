package Array;

import java.util.Arrays;

public class oneduplicate {
    public static void main(String[] args) {
        int[] arr={-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};  //1,1,2,2,3
        System.out.println(duplicate(arr));

    }
    public static int duplicate(int[] nums){
        int n=nums.length-1;
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n]!=nums[n-1]) return nums[n];
        for (int i = 0; i <=n; i++) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            
        }
        return -1;
    }
    
}

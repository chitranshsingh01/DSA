package BinarySearch;
public class twosum2 {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7};
        int[] ans=twoSum(arr,5);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
    public static int[] twoSum(int[] nums, int target) {
        int end=nums.length-1;
        int start=0;
        int[] ans=new int[2];
        while(start<=end){
            if(nums[start]+nums[end]==target){
                ans[0]=start+1;
                ans[1]=end+1;
                 return ans;
            }
            else if(nums[start]+nums[end]>target){
                end--;
            }
            else {
                start++;
            }
        }
       return ans;
        
    }
    
}

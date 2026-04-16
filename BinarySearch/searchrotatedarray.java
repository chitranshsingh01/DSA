package BinarySearch;

public class searchrotatedarray {
    public static void main(String[] args) {
        int[] nums={1,3}; //{5,6,0,1,2,3,4}
        int ans=search(nums,3);
        System.out.println(ans);
        

    }

    public static int search(int[] nums, int target) {
       
       int n=nums.length-1;
       int l=0;
       int r=n;
       while(l<=r){
         int mid=l+(r-l)/2;
         if(nums[mid]==target){
            return mid;
         }
         if(nums[l]<=nums[mid]){
            //left sorted.
            if(nums[l] <= target && target <= nums[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
         }
        else{
            //rigth sorted.
            if(nums[mid] <= target && target <=nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
       }
       return -1;
    }
    
}

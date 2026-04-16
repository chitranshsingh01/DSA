package BinarySearch;

public class finddupliacte {
    public static void main(String[] args) {
       int[] nums={1,3,5,3,4,7};
       System.out.println( findDuplicate(nums));

        }

     public static int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] flag=new boolean[n];
        for(int i=0;i<n;i++){
           int a=nums[i]; 
            if(flag[a]==true){
                return nums[i];
            }
            flag[nums[i]]=true;
             


        }
        return -1;
    }
}
    


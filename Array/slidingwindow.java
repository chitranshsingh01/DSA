package Array;

public class slidingwindow {
    public static void main(String[] args) {
        int[] arr={1,2,8,5,2,6,9,1};
        int ans=maxsum(arr,4);
        System.out.println(ans);

    }
    static int maxsum(int[]nums,int k){
        int sum=0;
        int Maxsum;
        for (int i = 0; i<k; i++) {
            sum+=nums[i]; 
        }
        Maxsum=sum;        
        for (int j = k; j < nums.length; j++) {
            sum= sum+  nums[j] - nums[j-k]; 
            Maxsum=Math.max(Maxsum, sum); 
            
        }
        return Maxsum;
       
    }
    
}

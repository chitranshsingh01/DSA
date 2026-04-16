package Array;

public class practice {
    public static void main(String[] args) {
        int[] arr = {29,30,31,32,33,34,35,36,37 };
        System.out.println(missingInteger(arr));
    }

    public static int missingInteger(int[] nums) {

        int sum=nums[0];
        int i;
        for ( i = 1; i < nums.length; i++) {
        if(nums[i]==nums[i-1]+1){
            sum+=nums[i];
          }
        else{
            break;
          }
        }
        // int sum2=sum;
        for (int k = 0; k < nums.length; k++) {
            for (int j = i-1; j < nums.length; j++) {
                if(sum==nums[j]){
                      sum++;
                      k=0;
                    break;  
                }
                else if(sum!=nums[j] && j==nums.length-1){
                     return sum;
                  
                }
            }
        }
        return sum;
        
    }

}

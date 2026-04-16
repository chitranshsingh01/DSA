import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L448 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1}; //1,2,3,4,2,3,7,8
        List<Integer> ans=findDisappearedNumbers(nums);
        System.out.print(ans); 
    }
     public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
      int i=0;
        while(i<nums.length){
            int real = i+1;
            if(nums[i]==real) i++;
            else{
                int num=nums[i];
                int temp=nums[i];
                nums[i]=nums[num-1];
                nums[num-1] =temp;
                i++;
            }
        }
        for (int j = 0; j <nums.length; j++) {
            int real=j+1;
            if(nums[j]!=real){
                ans.add(nums[j]);
            }
        }
        return ans; 
    }
}
    


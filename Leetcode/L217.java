import java.util.Arrays;
public class L217 {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean a=containsDuplicate(nums);
        System.out.println(a);
        
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j =i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }  
        }
        return false;
    } 
}

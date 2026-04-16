package Array;
import java.util.Arrays;

public class leet88 {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int [] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};
        merge(nums1,m,nums2,n);
        
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length;
        int j=0;
        for (int i = 0; i < nums2.length; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        
        for (int i : nums1) {
            System.out.print(i+" ");
            
        }
        
    }
    
}

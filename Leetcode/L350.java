import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L350 {
    public static void main(String[] args) {
        int [] nums1={9,4,9,8,4};//4,4,8,9,9
        int[] nums2={4,9,5};    //4,5,9
       int[] ans=intersect(nums1, nums2);
        for (int i : ans) {
            System.out.print(i+" ");
            
        }  
    }
     public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        int n=nums1.length;  
        int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int[] arr = new int[ans.size()];

for (int o = 0; o < ans.size(); o++) {
    arr[o] = ans.get(o);
}
        return arr;
    }
    
}

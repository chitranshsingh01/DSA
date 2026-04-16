public class twoarray {
   public static void main(String[] args) {
        int[] nums1 = {1,1,2,5};
        int[] nums2 = {1,1,2,5};
        merge(nums1,4,nums2,4);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num=new int[m+n];
        int j=0;
        int k=0;
        for (int i = 0; i < m+n; i++) {
            if (j<m && k<n) {
                if (nums1[j]< nums2[k]) { 
                      num[i]=nums1[j];
                      j++;
                  }
                  else{
                      num[i]=nums2[k];
                      k++;
                  }  
                
                  while(j<m){
                     num[i++]=nums1[j++];
                 }
                 while(k<n){
                     num[i++]=nums2[k++];
                 }
            }
                
            }
            for (int i  : num) {
                System.out.print(i+" ");
            }
        }
    
}

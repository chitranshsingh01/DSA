public class L912 {
    public static void main(String[] args) {
        int[] nnums={87,6,65,765,8,765,54};
        int[] ans=sortArray(nnums);
        for (int i : ans) {
            System.out.print(i+" ");
        }  
    }
    public static int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n==1) return nums;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int k=0;
        for(int i=0;i<a.length;i++){
            a[i]=nums[k++];
        }
        for(int i=0;i<b.length;i++){
            b[i]=nums[k++];
        }
        sortArray(a);
        sortArray(b);
         int[] c=helper(a,b,nums);
         return c;   
    }
    public static int[] helper(int[] a,int[] b,int[] c){
        int i=0;
        int j=0;
         int k=0;
         while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
         }
         while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
         }
         while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
         }
        return c;
    }
}

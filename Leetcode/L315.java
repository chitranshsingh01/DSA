import java.util.ArrayList;
import java.util.List;
public class L315 {
public static int count;
public static List<Integer> ans;
    public static void main(String[] args) {
        int[] nums={5,2,6,1};
        System.out.println(countSmaller(nums));
    }
     public static List<Integer> countSmaller(int[] nums) {
        count=0;
        mergesort(nums);
        List<Integer> ans=new ArrayList<>();
        return ans;
    }
      public static void mergesort(int[] arr){
        int n=arr.length;
        if(n==1) return ;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        List<Integer> list=new ArrayList<>();
      
        int k=0;
        for (int i = 0; i < a.length; i++) a[i]=arr[k++];
        for (int i = 0; i < b.length; i++) b[i]=arr[k++];
        mergesort(a);
        mergesort(b);
       list= merge(arr,a,b);
    }
     public static List<Integer> merge(int[] c,int[] a,int[] b){
          List<Integer> list=new ArrayList<>();
            int i=0,j=0,k=0;
          while(i<a.length&&j<b.length){
               if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
               }
               else{
                if(b[j]<a[i]){
                    count+=(a.length-i);
                }
                c[k]=b[j];
                j++;
                k++;
               }
               ans.add(count);
          }
           while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
           }
            while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
           }
        return ans;
    }
}

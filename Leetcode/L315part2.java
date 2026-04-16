import java.util.*;
public class L315part2 {
    static int count;
    static List<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        count=0;
        int[] arr={5,2,6,1};
        mergesort(arr);
        System.out.println(count);
        for (int i : ans) {
            System.out.print(i+" ");
            
        }
        
    }
     public static void mergesort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int k=0;
        for (int i = 0; i < a.length; i++) a[i]=arr[k++];
        for (int i = 0; i < b.length; i++) b[i]=arr[k++];
        mergesort(a);mergesort(b);
        merge(arr,a,b);
    }
     public static int[] merge(int[] c,int[] a,int[] b){
            int i=0,j=0,k=0;
          while(i<a.length&&j<b.length){
               if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
               }
               else{
                count+=(a.length-i);
                c[k]=b[j];
                j++;
                k++;
               }

          }
          ans.add(count);
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
        return c;
    }    
}

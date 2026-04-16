public class mergesort {
    public static void main(String[] args) {
        int[] arr={5,3,6,4,2,7,1};
        mergesort(arr);
             for (int i : arr) {
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

package Array;

public class merge2sortedarray {
    public static void main(String[] args) {   
        int[] a={2,4,6,8,9,20};
        int[] b={3,5,6,9,13,16};
        int[] c=new int[a.length+b.length];
        merge(c,a,b);
        }
        public static void merge(int[] c,int[] a,int[] b){
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

           for (int n : c) {
            System.out.print(n+" ");
            
           }
           
        }
    }
    


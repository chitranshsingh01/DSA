package Array;

public class merge {
         public static void main(String[] args) {   
        int[] a={2,4,6,8,9,20};
        int[] b={3,5,6,9,13,16};
        int[] c=new int[a.length+b.length];
        merge(c,a,b);
        for (int i : c) {
            System.out.print(i+" ");
            
        }
         }
        
        public static void merge(int[] c,int[] a,int[] b){
            int i=0;
            int j=0;
            int k=0;
            while(i<a.length && j<b.length){
                if(a[i]<b[j]){
                    c[k]=a[i];
                    k++;
                    i++;
                }
                else{
                    c[k]=b[j];
                    k++;
                    j++;
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

        }
    }

    


package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class returncommom {
    public static void main(String[] args) {

        int[] a={2,4,1,3,5,1,5,5};
        int[] b={6,4,3,4,1,7,5};
        //1,1,2,3,4,5,5;
        //1,3,4,4,5,6,7;
        int[] ans=common(a,b);
        for (int i : ans) {
            System.out.print(i+" ");
            
        }

        
    }
    static int[] common(int[] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr=new int[list.size()];
        Collections.sort(list);
        for (int k = 0; k <list.size(); k++) {
            arr[k]=list.get(k);   
        }
        return arr;
    }
    
}

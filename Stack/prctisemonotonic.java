import java.util.*;
public class prctisemonotonic {
    public static void main(String[] args) {

        int[] arr= {3,5,7,9,1,7,9};
        int nge[]=new int[arr.length];
        nge[nge.length-1]=-1;
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        st.push(arr[n-1]);
        for (int i = n-2; i >=0; i--) {
            while(st.size()>0 && st.peek()<=arr[i] ){
                st.pop();
            }
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
                st.push(arr[i]);
        }
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i]+" ");
        }  
    }
    
}

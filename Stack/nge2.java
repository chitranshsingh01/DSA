import java.util.*;
public class nge2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,3};
        int n=arr.length;
        int [] nge= new int[n];
        Stack <Integer> st = new Stack<>();
        st.push(arr[n-1]);
        nge[n-1]=-1;
        for (int i = n-2; i >=0; i--) {
            while (st.size()>0&&arr[i]>=st.peek()) {
                st.pop();
            }
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(arr[i]);
        }
        for (int i : nge) {
            System.out.print(i+" ");
            
        }
    }
    
}

import java.util.*;
public class rev{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        System.out.println(st.size());
        System.out.println(st);
        int[] arr=new int[st.size()];
        int n=st.size()-1;
        int i=0;
        while(i<=n){
            arr[i]=st.pop();
            i++;
        }
        System.out.println(st);
        for (int j = 0; j <=n; j++) {
            st.push(arr[j]);
        }
        System.out.println(st);

        
    }
}
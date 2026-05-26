import java.util.Stack;

public class basic{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(50);
        st.push(51);
        st.push(52);
        st.push(53);
        st.push(54);
        st.push(55);
        System.out.println(st);
        while(st.size()!=0) System.out.print(st.pop()+" ");
        // System.out.println(st.peek());
        // st.pop();
        // System.out.println(st.peek());
        // System.out.println(st.size());
        // System.out.println(st);
    }
}
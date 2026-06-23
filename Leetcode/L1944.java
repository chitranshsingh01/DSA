import java.util.Stack;

public class L1944 {
    public static void main(String[] args) {
        int [] heights = {1,2,3,4,5};
        int[] ans = canSeePersonsCount(heights);
        for (int i : ans) {
            System.out.print(i+" "); 
        }
        
    }
    public static int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            int count=0;
            while(st.size()>0 && st.peek()<heights[i]){
                st.pop();
                count++;
            }
            if(st.size()>0) count++;
            ans[i]=count;
            st.push(heights[i]);
        }
        return ans;
    }
}

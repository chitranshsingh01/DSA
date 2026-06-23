import java.util.*;
public class canSeePersonsCount {
    public static void main(String[] args) {
        int[] heights ={4,3,2,1};
        int [] a =canSeePersonsCount(heights);
        for (int i : a) {
            System.out.print(i+" ");
            
        } 
    }

    public static int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st =new Stack<>();
        int[] ans=new int[heights.length];
        int count=0;
        ans[ans.length-1]=0;
        for(int i=0;i<=heights.length-1;i++){
            for(int j=heights.length-1;j>i;j--){
                st.push(heights[j]);
            }
            while(st.size()>0 && heights[i]>st.peek()){
                count++;
                int a=st.pop();
                if(st.size()>0&&a>st.peek()) count--; 
                
            }
            if(st.peek()>heights[i])count++;
            ans[i]=count;
            count=0;
            ans[ans.length-1]=0;
            while(st.size()>0) st.pop();
        }
        return ans;

        
        
    }
    
}

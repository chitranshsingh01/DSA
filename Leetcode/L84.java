import java.util.*;
public class L84 {
    public static void main(String[] args) {
        int[] heights={0,10};
        int ans=largestRectangleArea(heights);
        System.out.println(ans);
        
    }
     public static int largestRectangleArea(int[] heights) {
        if(heights.length==1) return heights[0];
        int area=0;
        int maxarea=0;
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        st.push(heights[n-1]);
        for (int i = n-2; i>=0; i--) {
            if (st.size()>0 && st.peek()<heights[i]) {
              while (st.size()>0) {
                st.pop();
              }
            }
            if(st.size()>0){
                area=heights[i]*(st.size()+1);
                maxarea=Integer.max(maxarea,area);
            }
            st.push(heights[i]);
            // if(i==0 && maxarea<heights[0]) return heights[0];
        }
        return maxarea;
    }

    // public static int largestRectangleArea(int[] heights){

    //     Stack<Integer> st=new Stack<>();
    //     int n=heights.length;
    //     int[] nse=new int[n];
    //     int[] pse=new int[n];
    //     st.push(n-1);
    //     nse[n-1]=n;
    //     for(int i=n-2;i>=0;i--){
    //         while(st.size()>0 && heights[st.peek()]>=heights[i]) st.pop();
    //         if(st.size()==0) nse[i]=n;
    //         else nse[i]=st.peek();
    //         st.push(i);
    //     }
    //     while(st.size()>0) st.pop();
    //     pse[0]=-1;
    //     st.push(0);
    //      for(int i=1;i<=n-1;i++){
    //         while(st.size()>0 && heights[st.peek()]>=heights[i]) st.pop();
    //         if(st.size()==0) pse[i]=-1;
    //         else pse[i]=st.peek(); 
    //         st.push(i);
    //     }
    //     int maxarea=0;
    //     for (int i = 0; i < n; i++) {
    //         int area=heights[i]*(nse[i]-pse[i]-1);
    //         maxarea=Integer.max(maxarea, area);
    //     }
    //     return maxarea;
    // }
    
    
}

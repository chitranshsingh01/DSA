import java.util.Stack;
public class nextgrtrele2 {
    public static void main(String[] args) {

        // nums = [1,2,3,4,3];
        // ans==[2,3,4,-1,4];

        // stack ==  1,2,3,4,3 ; 
    }
     public int[] nextGreaterElements(int[] nums){
        int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i++){
            st.push(nums[i]);
        }
        for (int i = n-1; i>=0; i--) {
            while(st.size()>0 && nums[i] >= st.peek()) st.pop();
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
             st.push(nums[i]);
        }
        return nge;
     }




}

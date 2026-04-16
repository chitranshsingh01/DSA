import java.util.Stack;

public class L739{
    public static void main(String[] args) {
        int[] arr={10,11,12,13,15,16,17};
       int[] ans= dailyTemperatures(arr);
       for (int i : ans) {
        System.out.print(i+" ");
        
       }
    }
     public static  int[] dailyTemperatures(int[] temp) {
        int[] arr=new int[temp.length];
        Stack<Integer> stack=new Stack<>();
        // stack.push(temp[0]);
        for (int i = 0; i < arr.length-1; i++) {
            int count=1;
            int idx=i;
            if(temp[i+1]>temp[i]){
                arr[i]=count;
                if(temp[i]==stack.peek()) stack.pop();
                 while(stack.size()!=0 && stack.peek()<temp[i+1]){
                arr[--idx] = ++count;
                stack.pop();
             }
            }
            else{
                stack.push(temp[i]);
            }
        }
        arr[arr.length-1]=0;
        return arr;
    }
}
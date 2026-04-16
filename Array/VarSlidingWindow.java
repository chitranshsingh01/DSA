package Array;

public class VarSlidingWindow {
    
    public static void main(String[] args) {
        int[] arr={1,4,4};
        int target=1;
        int maxlen=Integer.MIN_VALUE;
        int numidx=0;
        int sum=0;
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            while(sum>=target){
                sum=sum-arr[k++];
            }
            maxlen=Math.max(maxlen, i-k); 
        }
        System.out.println(numidx);
        System.out.println(maxlen);

    }
    
}

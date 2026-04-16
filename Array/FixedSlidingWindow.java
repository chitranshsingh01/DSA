package Array;
public class FixedSlidingWindow{
    public static void main(String[] args) {
        int[] arr={1,2,33,4,5,6,7,8};
        int k=3;
        int j=0;
        int sum=0;
        for (j = 0; j <k; j++) {
            sum+=arr[j];
        }
        int max=sum;
        for ( ;j < arr.length; j++) {
            sum=sum+arr[j]-arr[j-k];
            max=Math.max(max, sum);
        }
        System.out.println(max);   
    }
}
public class max {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,765,78,89};
        int n=0;
        System.out.println(max(arr,n));
    }
    public static int max(int[] arr,int n){
        if(n==arr.length-1) return arr[n];

        int maxall=max(arr,n+1);

        int ans=Math.max(maxall, arr[n]);
        return ans;
    }
    
}

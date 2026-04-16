package BinarySearch;

public class lastoccurence {
      public static void main(String[] args) {
        
        int[] arr={-43,-1,4,4,4,6,8,8,8,23,53,77,77,77,77};
        int target = 77;
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                ans=mid;
            l=mid+1;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }   
            else{
                l=mid+1;
            }
        }
        System.out.println(ans);
    }
    
}

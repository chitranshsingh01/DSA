package BinarySearch;

public class peakmountain {
     public static void main(String[] args) {
        
        int[] arr={1,9,18,20,88,6,4,2};
        //int target = 4;
        int l=1;
        int r=arr.length-1;
       // boolean found=false;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                System.out.println("Peak found at "+mid);
               // found=true;
                break;
            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                l=mid+1;
            }   
            else{
               r=mid-1;
            }
        }
        // if(!found){
        // System.out.println(" not found");
        // }
    }
    
    
}

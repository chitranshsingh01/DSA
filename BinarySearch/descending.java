package BinarySearch;

public class descending {
     public static void main(String[] args) {
        
        int[] arr={99,87,64,24,6,5,1};
        int target = 0;
        int l=0;
        int r=arr.length-1;
        boolean found=false;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                System.out.println("Target found at "+mid);
                found=true;
                break;
            }
            else if(arr[mid]>target){
               
                l=mid+1;
            }   
            else{
                 r=mid-1;
            }
        }
        if(!found){
        System.out.println(" not found");
        }
    }
    
    
}

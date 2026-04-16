package BinarySearch;

public class binsearch {
    public static void main(String[] args) {
        
        int[] arr={-43,-1,4,4,4,6,8,8,8,23,53,77,77,77,77};
        int target = 4;
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
                r=mid-1;
            }   
            else{
                l=mid+1;
            }
        }
        if(!found){
        System.out.println(" not found");
        }
    }
    
}

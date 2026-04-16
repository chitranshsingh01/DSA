package Array;

public class rotatearray {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;//7
        int o=n-k;//4


        int[] arr2 = reverse(arr,0,o-1);
        int[] arr3= reverse(arr2,o,n-1);
        int[] result =reverse(arr3,0,n-1);
        for (int i : result) {
            System.out.print(i+" ");
            
        }
    }



        static int[] reverse(int[] arr , int start,int end){
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    
}

package Array;

public class shiftzero {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
         int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<=j){
            if(nums[i]==0){
              int temp=nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
              i++;
              j--;
              count++;
            }
            else{
                i++;
            }
        }
        int start=0;
        int end=nums.length-count;
        sort(nums,start,end);
    }
    
    static void sort(int[] arr,int start,int end){
        int n = arr.length;

       for (int i = start; i < end; i++) {
        boolean swapped = false;

        for (int j = start+1; j < end -i-1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }

        // already sorted
        if (!swapped) break;

    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}

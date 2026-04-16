public class Cyclicsort{
    public static void main(String[] args) {
        int[] arr={1,5,4,3,3,2};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }

    }
    public static void sort(int[] nums){
        int n=nums.length;
        int i=0;
        while(i<nums.length){
            int real = i+1;
            if(nums[i]==real) i++;
            else{
                int num=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[num];
                nums[num] =temp;
            }
        }
    }

}
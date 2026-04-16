package Array;

public class productofarrayitself {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int n=nums.length-1;
        int[] ans=new int[nums.length]; 

        for (int i = 0; i <=n; i++) {
            int l=i-1;
            int r=i+1;
            int mul1=1;
            int mul2=1;
            while(l>=0){
                mul1=mul1*nums[l];
                l--;
            }
            while(r<=n){
                mul2=mul2*nums[r];
                r++;
            }
            int res=mul1*mul2;
            ans[i] =res;
        }
        for (int i : ans) {
            System.out.print(i+" ");  
        }
    } 
}

package Array;

import java.util.Arrays;

public class prefixsum {
    public static void main(String[] args) {

          int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;

        int[] pre = new int[n];

        // build prefix sum
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * arr[i];
        }

        for (int i : pre) {
            System.out.print(i+" ");
            
        }

        // print prefix sum array
        System.out.println(Arrays.toString(pre));

        // example: sum from index l to r
        int l = 1, r = 3;
        int sum;

        if (l == 0) {
            sum = pre[r];
        } else {
            sum = pre[r] * pre[l - 1];
        }

        System.out.println("Sum from " + l + " to " + r + " = " + sum);
        
    }
    
}

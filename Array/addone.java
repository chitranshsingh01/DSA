package Array;
import java.util.ArrayList;
import java.util.Collections;

public class addone {
    public static void main(String[] args) {

        int[] arr={9,9,9,9,9,9,9};
        int [] ans=returnone(arr);     
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
            
        }

    }

    static int[] returnone(int[] nums) {

    ArrayList<Integer> arr = new ArrayList<>();
    int carry = 1;

    for (int i = nums.length - 1; i >= 0; i--) {
        int sum = nums[i] + carry;

        if (sum < 10) {
            arr.add(sum);
            carry = 0;
        } else {
            arr.add(0);
            carry = 1;
        }
    }

    if (carry == 1) {
        arr.add(1);
    }

    Collections.reverse(arr);

    int[] result = new int[arr.size()];
    for (int i = 0; i < result.length; i++) {
        result[i] = arr.get(i);
    }

    return result;
}

    
}

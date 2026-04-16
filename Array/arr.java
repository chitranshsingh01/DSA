package Array;
import java.util.*;

public class arr {
public static void main(String[] args) {

    int[] arr={5,4,3,2,1};
        // Scanner sc=new Scanner(System.in);
        // String[] arr=new String[5];
        // System.out.print("enter the array");
        // for (int i = 0; i < arr.length; i++) {

        //     arr[i]= sc.nextLine();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
            
        // }
        
        // int last=arr.length-1;
        // System.out.println(arr[last]);
        // if(arr[last]=="ok"){
        //     System.out.println("hello chitransh");
        // }else{
        //     System.out.println("invalid person");
        // }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(arr[i]+" ");
        }

}
    
}

package Array;
import java.util.Scanner;

public class twopointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of elements in array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array:");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(" reversing by two pointer");
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        
        
    }
    
}

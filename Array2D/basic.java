package Array2D;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][2];
        int[][] arr2={{1,2,3},{1,2,3},{1,2,3}};
       for (int i = 0; i <3; i++) {
        for (int j = 0; j <3; j++) {
            System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
        
       }
       for (int i = 0; i <arr.length; i++) {
        for (int j = 0; j <arr[0].length; j++) {
            System.out.println("Enter " +i + "," + j +" element : ");
            arr[i][j]=sc.nextInt();
        }
        
       }

    }
    
}

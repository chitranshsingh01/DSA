package Array;

public class oddeven {
public static void main(String[] args) {
           
        int[] arr={1,2,34,5,6,7,8};
        for ( int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i] = arr[i]*2;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }  
}

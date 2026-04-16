package Array;

public class secmax {
    public static void main(String[] args) {
        
    
    int[] arr={2,6,4,10,30,30,12};
    int max=arr[0];
    int secmax=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        
    }

    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>secmax && arr[i]!=max){

            secmax=arr[i];
        }
        
    }
    System.out.println(" max and secmax are"+max+"and"+secmax);
    
}
}

public class choclate {
    public static void main(String[] args) {
        int[] arr={1,5,3,0,7,4,0,2,0,3,4};
        int n=arr.length;
         for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
    }
     for (int i : arr) {
            System.out.print(i+" ");
            
        }
}
}

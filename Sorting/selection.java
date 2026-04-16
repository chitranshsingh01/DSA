public class selection {
    public static void main(String[] args) {
        
        int[] arr={3,1,2,6,9,80,90,100};
        
        for (int i = 0; i < arr.length; i++) {
            int minindex=i;
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[j]<arr[minindex]){
                minindex=j;
                }
            }
               int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp; 
           
            }

            
        
       for (int i : arr) {
        System.out.print(i+" ");
        
       }
        
    }
    
}

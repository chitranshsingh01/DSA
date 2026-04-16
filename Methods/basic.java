package Methods;

public class basic {
public static void main(String[] args) {
    // int[] nums=new int[5];
     int[] nums={3,4,2,5,7};

          String name="chitransh";
          greet(name);
          int a = 10000;
          System.out.println(square(a));
          sort(nums);
}


    static void greet(String a){
        System.out.println("hello "+a);

        

    }
    static int square(int num){

        num=num*num;
        return num;
    }
    static void sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }

                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
         

    }
    
}

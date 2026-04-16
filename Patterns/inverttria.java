package Patterns;

public class inverttria {
    public static void main(String[] args){
        int[] arr= new int[5];
        int a= arr.length;
        
        for (int i=5; i >=1 ;i--) {
            for (int j=i; j >=1; j--) {

                if(j>=i){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
              
                
            }
            System.out.println();
        }
    }
    
}

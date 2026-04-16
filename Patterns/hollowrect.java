package Patterns;

public class hollowrect {
    public static void main(String[] args) {
        
          for (int i = 0; i <=5; i++) {
         for (int j = 0; j <=8; j++) {
            if(i==0||i==5||j==0||j==8){
            
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

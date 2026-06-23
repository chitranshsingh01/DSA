import java.util.*;
public class stockspan {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] stock=new int[arr.length];
        stock[0]=1;
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            int count=0;
            if (arr[i-1]>arr[i]){stock[i]=1;}
            else{
                  while(j>=0&&arr[j]<=arr[i]){
                count++;
                j--;
            }
            stock[i]=count;
            }
        }
        for (int i = 0; i < stock.length; i++) {
            System.out.print(stock[i]+" ");
            
        }
    }
    
}

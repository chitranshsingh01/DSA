package Fundamentals;

public class sumnum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9};
        
    
    int n =9; ;
    int sum=0;
    while(n>0){
        sum=sum+n;
        n--;

    }
    System.out.println(sum);
    int sum2=0;

    for(int i=0;i<arr.length;i++){

        sum2=sum2+arr[i];
    }
    System.out.println(sum2);
    int result=sum-sum2;
    System.out.println(result);
    
    }
}

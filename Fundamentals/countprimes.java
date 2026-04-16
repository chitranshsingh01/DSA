package Fundamentals;

public class countprimes {
    public static void main(String[] args) {
    int n=100;
    System.out.println("hello");
    System.out.println(prime(n));
    System.out.println("hello");

    }
    static int prime(int n){

        int count =0;

        if(n<=1) return 0;
        for (int i = 2; i < n; i++) {
            int count2=0;

            for (int j = 1; j <=i; j++) {

                if(i%j==0){
                    count2++;
                }
            }
            if(count2==2){
                count++;
                
            }
        }
        return count;
    }
    
    
}

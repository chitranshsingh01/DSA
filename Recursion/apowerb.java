import java.util.Scanner;

public class apowerb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base :");
        long a=sc.nextInt();
        System.out.println("enter exponent :");
        long b=sc.nextInt();
        System.out.println(pow(a,b));
    }
    static long pow(long a,long b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    
}

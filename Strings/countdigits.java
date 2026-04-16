package Strings;
import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        String s="akash";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        long num=sc.nextInt();
        String a=""+num;
        System.out.println("Number of digits in it are : "+a.length());

    }
}

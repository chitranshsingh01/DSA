package Strings;
import java.util.Scanner;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={1,2,34,5,6,7};
        char[] naam={'a','k','a','s','h'};
        
        String name="chitransh";
        String surname="Singh";
        String x="rakh lo tum chhupake fir khat likh ke hi kahna";
        System.out.println(name+" "+surname);
        System.out.println(Arrays.toString(arr));
        System.out.println(x);
        System.out.println("give input:");
        String s=sc.nextLine();
        System.out.println(s);
        int n=123;
        String changed=Integer.toString(n);
        System.out.println(changed);
        String num="53486";
        int tonum=Integer.parseInt(num);
        System.out.println(tonum+1);
        String gunnu="tunnu";
        char[] tunna=gunnu.toCharArray();
        System.out.println(tunna);
    } 
}

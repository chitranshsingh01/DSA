import java.util.*;
public class L242 {
    public static void main(String[] args) {
        String s="rac";
        String t= "car";
        System.out.println(isAnagram(s,t));        
    }
    public static boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b); 
    }   
}

package Strings;

public class builtins {
    public static void main(String[] args) {
        
String s="dheeredhherejaragumlena";
s.trim();
     
        s.charAt(6);
        s.length();
        s.substring(4,8);
        System.out.println(s);
        String a=s.trim();
        System.out.println(a);
        int count=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            
        }
        System.out.println(count);

     





    }
    
}

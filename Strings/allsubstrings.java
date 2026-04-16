package Strings;

public class allsubstrings {
    public static void main(String[] args) {
        
        String s="rakhlotumchupake";
        for (int i = 0; i <=s.length(); i++) {

            System.out.println(s.substring(0,i));
            
        }
        for (int i = 0; i <=s.length(); i++) {
            System.out.println(s.substring(i));
            
        }
    }
    
}

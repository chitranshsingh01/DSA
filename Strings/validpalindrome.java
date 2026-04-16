package Strings;

public class validpalindrome {
    public static void main(String[] args) {

        String s=".,";
       System.out.println(isPalindrome(s));

 
        
    }
     public static boolean isPalindrome(String s) {
        if(s.length()==1) return true;
           s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;
        //    System.out.println(s);
           int end=s.length()-1;
           int start=0;
           boolean flag=false;
           while (start<end) {
            if(s.charAt(start)==s.charAt(end)){
               flag=true;
            }
            else{
                flag=false;
                break;
            }
            start++;
            end--;
            
           } 
        return flag;
        
    }
}


/*public static boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}*/

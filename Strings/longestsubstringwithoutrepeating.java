package Strings;

public class longestsubstringwithoutrepeating {
    public static void main(String[] args) {
        String a="abcabcbb";
        System.out.println(lengthOfLongestSubstring(a));
    }
    public static int lengthOfLongestSubstring(String s){
        int j=0;
        int len=0;
        int k;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            boolean flag=false;
            for (k= j; k<=i; k++) {
                if(i<s.length()-1 && s.charAt(i+1)==s.charAt(k)){
                    flag=true;
                    break;
                }
            }
            len=(i-j)+1;
       max=Math.max(max, len);
         if(flag){
                j=k+1;
            } 
           
        }
        return max; 
    }
    
}

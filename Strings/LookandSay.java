package Strings;

public class LookandSay {
    public static void main(String[] args) {
        int n=4;
        System.out.println(nextstring(n));
    }
    public static String nextstring(int n){
        if(n==1) return "1";
       String s= nextstring(n-1);
       String ans="";
        int i=0;
        int j=0;
        int l=0;
      //  String s="";
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                l=j-i;
                 ans+=l;
            ans+=s.charAt(i);
            i=j;
            }
            if(j==s.length()){
                ans+=(j-i);
                ans+=s.charAt(i);
            }
            // if()
            j++;
        }
         l=j-i;
                 ans+=l;
            ans+=s.charAt(i);
        return ans;
    }
    
}

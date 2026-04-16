package Strings;
public class one{
 public static void main(String[] args) {
        String[] strs={"flower","flat","fly"};
        System.out.println(longestCommonPrefix(strs));
        
    }
       public static String longestCommonPrefix(String[] strs) {
        String ans="";
         String a=strs[0];
        for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
            for (int j= 1; j <strs.length; j++) {
                String b=strs[j];
                char ch2=b.charAt(i);
                if(i >= strs[j].length() ||ch!=ch2){
                    return ans;
                }                
            }
            ans+=ch;
        }
        return ans;
    }
}

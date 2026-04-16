public class L5 {
    public static void main(String[] args) {
        String s="ababdefr";
       String a= longestPalindrome(s);
       System.out.println(a);
  
    }
     public static String longestPalindrome(String s) {
        System.out.println("hello");
        if(s.length()==1) return s;
        String ans="";
        String ans2="";
       int i=0;
       int j=i+1;
       while(i<s.length() && j<s.length()){
        if(j==s.length()-1) j=i+1;
          boolean flag=false;
                if(s.charAt(j)==s.charAt(i)){
                    j=i+1;
                    System.out.println("hello2");
                    
                    System.out.println(ans2);
                    int o=i;
                    int p=j;
                    while(o<=p){
                        if(s.charAt(o)==s.charAt(p)){
                            flag=true;
                        }
                        else{
                            flag=false;
                            break;
                        }
                        o++;
                        p--;
                    }  
                    i++;
                } 
                if(flag){
                   ans=s.substring(i, j+1);
                //    ans2=Math.max(ans.length(), ans2.length());
                if(ans.length()>ans2.length()){
                    ans2=ans;
                }      
                    } 
                else{
                   ans="";
                    }
       
        j++;
       }
        return ans2;
    }
}

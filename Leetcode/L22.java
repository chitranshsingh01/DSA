import java.util.*; 
public class L22 {
    public static void main(String[] args) {
        int a=3;
        List <String> ans=new ArrayList<>();
             ans=   generateParenthesis(2);
             for (String i : ans) {
                System.out.print(i+" ");
             }   
    }
     public static List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        generate("",0,0,s,n);
        return s;  
    }
    public static void generate(String s,int l,int r,List<String> ans,int n){
        if(r==n){
            ans.add(s);
            return ;
        }
        if(l<n) generate(s+"(",l+1,r,ans,n);
        if(r<l) generate(s+")",l,r+1,ans,n);
    }
}

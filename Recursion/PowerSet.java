import java.util.*;
public class PowerSet {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> ans=new ArrayList<>();

        set("",s,0);
        
    }
    public static void set(String ans,String s,int idx){
        if(idx==s.length()){
            System.out.print(ans+" ");
            return;
        }
        set(ans+s.charAt(idx),s,idx+1);
        set(ans,s,idx+1);
    }
    
}

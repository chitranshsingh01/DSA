public class palindrome {
    public static void main(String[] args) {
        String n="12345";
        int last=n.length()-1;
        System.out.println(palindrome(n,0,last));
    }
    public static boolean palindrome(String n,int start,int last){
        if(start>=last) return true;
        if(n.charAt(last)!=n.charAt(start)) return false;
        return palindrome(n,start+1,last-1);
    }
}  

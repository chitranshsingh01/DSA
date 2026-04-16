package Strings;

public class reverse {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println("done");

        
    }
       public static void reverseString(char[] s) {
        int n=s.length-1;
        int start=0;
        int end=n;
        while(start<=end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        

        for (char c : s) {
            System.out.print(c+" ");
        }
        
        
    }
    
}

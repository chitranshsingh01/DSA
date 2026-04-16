// package Bitmanipulation;
public class reversebits {
    public static void main(String[] args) {
        int n=12345;
        int ans =reverseBits(n);
        System.out.println(ans);
        
    }
     public static int reverseBits(int n) {
        if (n==0) {
            return 0;
        }

        String binary=Integer.toBinaryString(n);
        char[] character=binary.toCharArray();
        int i=0;;
        int j=character.length;
        while(i<=j){
            char temp=character[i];
            character[i]=character[j];
            character[j]=temp;
        }
        binary=character.toString();
        int ans=Integer.parseInt(binary,2);
        return ans;   
    }

}


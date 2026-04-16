public class Binalternatingbits {
    public static void main(String[] args) {
        int n=5;//1011
        System.out.println(hasAlternatingBits(n));
       
        
    }
     public static boolean hasAlternatingBits(int n) {
         String binary=Integer.toBinaryString(n);
        System.out.println(binary);
        for (int i = 0; i < binary.length()-1; i++) {
            int j=i+1;
            if(binary.charAt(i)!=binary.charAt(j)){
                j++;
                return true;
            }
        }
        return false;  
    }
}

public class gcd {
    public static void main(String[] args) {
        int a=17;
        int b=2;
        int max=Math.max(a,b);
        System.out.println(gcd(a,b,max)); 
    }
    public static int gcd(int a,int b,int max) {
        if(a%max==0 && b%max==0) return max;
        if(max==0) return 0;
        return gcd(a,b,max-1);
    }
}
    
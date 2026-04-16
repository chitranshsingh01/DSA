public class Basic{
    public static void main(String[] args) {
        int a=10;
        printrev(a);
        System.out.println();
        printfor(a); 
    }
    public static void printrev(int n){
            System.out.print(n+",");
            if(n==0) return;
            printrev(n-1);
    }
    public static void printfor(int n){
        System.out.print(n+",");
        if (n==20) return;
        printfor(n+1);
    }
}
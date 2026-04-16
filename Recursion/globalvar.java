public class globalvar {
    static int n=20;
    public static void main(String[] args) {
        int a=0;
        print(a);
        
    }
    static void print(int x){
        if(x>20) return ;
        System.out.print(x+",");
        print(x+1);
    }
    
}

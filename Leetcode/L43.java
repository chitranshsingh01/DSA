import java.math.BigInteger;
public class L43 {
    public static void main(String[] args) {
        String a="3";
        String b="2";
        System.out.println(multiply(a,b));

        

    }
     public static String multiply(String num1, String num2) {
       BigInteger a=new BigInteger(num1);
       BigInteger b=new BigInteger(num2);
       BigInteger c=a.multiply(b);
        
        String s=c.toString();
        return s;
        
    }
    
}

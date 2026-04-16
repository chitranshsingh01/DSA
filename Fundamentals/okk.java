package Fundamentals;

public class okk {
    public static void main(String[] args) {
       // double a =9;
        // System.out.println(a);
        // int b=(int)a;
        // System.out.println(b);
        // char h = '4';
        // System.out.println(h);
        // System.out.println((int)h);
        // System.out.println(5>3);
        // boolean a=true;
        // if(a){
        //     System.out.println("yesss");
        // }
        // else{
        //     System.out.println("noo");
        // 
        // for ( int i = 0; i <=100; i+=2) {
        //     System.out.print(i+ " "); 
        // }
        // for (int i =17; i <=170; i+=17) {
        //     System.out.println(i);
        // }
        // for (char i = 'a'; i <='z'; i++) {
        //     System.out.print(" "+i);
        //     System.out.println((int)i);
        // }


        // Scanner sc =new Scanner(System.in);
        // System.out.print("enter the number to check if it is prime or not:");
        // int a = sc.nextInt();
        // for (int i = 2; i <a; i++) {
        //     if(a%i==0){
        //         System.out.println("it is not prime");
        //     }
        //     else{
        //         System.out.println("Prime");
        //     }
        //    break;
        // }
         System.out.print("num of rows:");
        
        System.out.print("num of columns:");
        int row=5;
          for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
          }

    }
    
}

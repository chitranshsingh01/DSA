import java.util.LinkedList;
import java.util.Queue;

public class addatindex{
    public static void main(String[] args) {
            Queue<Integer> q=new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.add(7);
            q.add(8);
            q.add(9);
            addat(q,55,10);
            System.out.println(q);
            //[1,2,3,4,5]
    }
    public static  void addat(Queue<Integer> q,int a,int num){
        int n=q.size();
        if(a>n){
            System.out.println("errrrrrooorroorr");
            return;
        }
        int count=0;
        for (int i = 1; i <=a-1; i++) {
            q.add(q.remove());  
            count++;  
        }
        q.add(num);
        for (int i =1 ; i <=n-count; i++) {
                        q.add(q.remove());  
        }
    }
}
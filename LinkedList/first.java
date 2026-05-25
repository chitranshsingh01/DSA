public class first{
   static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    
    public static void main(String[] args) {
        node a=new node(10); //a.val=10
        node b=new node(20);       //b.val=10;
        node c=new node(30);       //c.val=20
        node d=new node(40);
        //initialized

        //now linking with each other
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a.next);
        System.out.println(d.next);
        System.out.println(a.val);
        
        
    }
    
}

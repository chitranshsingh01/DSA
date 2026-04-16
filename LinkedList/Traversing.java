public class Traversing {
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
        node e=new node(50);
        node f=new node(60);
        //initialized

        //now linking with each other
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        displayrec(a);
        System.out.println();
        display(a);
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void displayrec(node head){
        node temp=head;
        if(temp==null) return;
        System.out.print(temp.val+" "); 
        displayrec(head.next);
    }
    
}

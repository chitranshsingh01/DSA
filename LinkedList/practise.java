public class practise {
   static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        } 
    }
    static class Linkedlist{
        Node head;
        Node tail;
        int size;

           void addhead(int val){
        if(head==null){
            Node a =new Node(val);
        }
        Node a =new Node(val);
        a.next=head;
        head=a;
    } 
void addtail(int val){
    if(head==null) return ;
    Node temp=head;
    while(temp.next!=null) temp=temp.next;
    Node a =new Node(val);
    temp.next=a;
}
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        // Node a =new Node(100);
        // Node b =new Node(200);
        // Node c =new Node(300);
        // a.next=b;
        // b.next=c;
        list.addhead(10);
        list.addhead(20);
        list.addhead(30);
        list.addhead(40);
        list.addtail(100);
        list.addtail(200);
        Node temp=list.head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    
}

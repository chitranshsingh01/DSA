public class L19 {
      static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(10);
        ListNode b=new ListNode(20);
        ListNode c=new ListNode(30);
        ListNode d=new ListNode(40);
        ListNode e=new ListNode(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       removeNthFromEnd(a,5);
       ListNode temp=a;
       while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
       }
    }
       public static void removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int remove=count-n;
        temp=head;
        for(int i=1;i<remove;i++){
            temp=temp.next;
        }
        if(remove==0){
            head= head.next;
        }
        temp.next=temp.next.next;
    }
    
}

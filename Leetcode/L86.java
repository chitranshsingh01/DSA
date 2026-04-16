public class L86{
      static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        
    }
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy2 =new ListNode (-1);
        ListNode a=dummy;
        ListNode b=dummy2;
        ListNode temp =head;
        while(temp!=null){
            if(temp.val<x){
                dummy.next=temp;
                dummy=dummy.next;
            }
            else{
                dummy2.next=temp;
                dummy2=dummy2.next;
            }
            temp=temp.next;
        }
        // a=a.next;
        b=b.next;
        dummy.next=b;
        return a.next;
    }
}
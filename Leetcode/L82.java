public class L82 {
        static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        
    }
       public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp=head;
        int a=101;
       while(temp!=null){
        if(temp.next!=null&&temp.val==temp.next.val){
             a=temp.val;
             while(temp.val==a){
                 temp.next=temp.next.next;
             }
        }
        temp=temp.next;
       }
        return head;
    }
}

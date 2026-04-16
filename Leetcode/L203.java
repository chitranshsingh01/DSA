public class L203 {
      class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
    }
    public ListNode removeElements(ListNode head, int val) {
            ListNode temp=head;
            while(temp!=null){
                if(temp.next.val==val){
                    temp.next=temp.next.next;
                }
            }
            return head;
    }
}

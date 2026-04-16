public class L61 {
      static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        
    }
      public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(k>count){
            k=k%count;
        }
        if(k%count==0) return head;
        temp=head;
        int n=count-k-1;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        ListNode head2=temp.next;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
        }
        temp.next=null;
        last.next=head;
        return head2;
    }
    
}

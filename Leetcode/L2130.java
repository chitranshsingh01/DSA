public class L2130{
      static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        
    }
      public static int pairSum(ListNode head) {
        

        //count
        int count=0;
        ListNode temp=head;
        ListNode b=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int mid=count/2;
        for(int i=0;i<mid;i++){
            temp=temp.next;
        }
        if(count%2!=0) temp=temp.next;
         ListNode a=temp;
        //reverse 
         ListNode prev=null;
        ListNode curr=a;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        a=prev;
        int max=Integer.MIN_VALUE;
        while(b!=null && a!=null){
            int c=b.val+a.val;
            max=Math.max(max, c);
        }
        if(b!=null){
            max=Math.max(max,b.val+b.val);
        }
        else{
            max=Math.max(max,a.val+a.val);
        }  
        return max;
    }
}
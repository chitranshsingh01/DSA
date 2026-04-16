public class L160 {
       static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        
    }
    //  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode a=headA;
    //     ListNode b=headB;
    //     while(a!=null){
    //         while(b!=null){
    //             if(b==a){
    //                 return a;
    //             }
    //             b=b.next;
    //         }
    //         b=headB;
    //         a=a.next;
    //     }
    //     return null;  
    // }
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while(a!=null){
            if(b==null) {
                b=headB;
                a=a.next;
            }
            if(b==a)return a;
            else{
                b=b.next;
            }
        }
        return null;  
    } 
}

public class L237 {
       static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
    }
    class Solution {
    public void deleteNode(ListNode node) {
        if(node.next==null){
            node.val=node.next.val;
            node.next=null;
        }
        else{
        node.val=node.next.val;
        node.next=node.next.next;
        }
    }
}
}

public class L876{
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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        int idx;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        // if(count%2!=0) {
        //     idx=(count/2)+1;
        // }
        // else{
        //     idx=(count/2)+1;
        // }
        idx=(count/2);
        // idx-=1;
        ListNode temp2=head;
        for(int i=1;i<=idx;i++){
            temp2=temp2.next;
        }
        return temp2;
    }
}

}
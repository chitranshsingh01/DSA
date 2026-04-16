import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class L2487 {
    public static void main(String[] args) {
            ListNode a=new ListNode(5); //a.val=10
        ListNode b=new ListNode(2);       //b.val=10;
        ListNode c=new ListNode(13);       //c.val=20
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ListNode ans= removeNodes(a);
      //  [5,2,13,3,8]
          while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
    public static ListNode removeNodes(ListNode head) {
         //  [5,2,13,3,8]
        ListNode temp=head;
        Stack<ListNode> stack= new Stack<>();


        while(temp!=null){
            // if() stack.push(temp);
             if(stack.size()==0 || temp.val < stack.peek().val) stack.push(temp);
            else{
                while( stack.size()!=0||stack.peek().val > temp.val ){
                    stack.pop();
                }
                stack.push(temp);
            }
            temp=temp.next;
        }
        ListNode n=null;
        ListNode temp2=n;
        while(stack.size()!=0){
            stack.pop().next=n;
            temp2=stack.pop();
        }
        return temp2;
        
    }
}

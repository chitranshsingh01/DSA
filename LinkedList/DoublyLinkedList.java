// import HeadTail.linkedlist;

public class DoublyLinkedList{
    static class Listnode{ //user defines doubly linked list
        int val;
        Listnode next;
        Listnode prev;
        Listnode(int val){this.val=val;};
    }
    static class DLL{
        Listnode head;
        Listnode tail;
        int size;
        void insertAthead(int val){
            Listnode temp=new Listnode(val);
            if(head==null) head=tail=temp;
            else{
                temp.next=head;
                head.prev=temp;
                head=temp;
            }
            size++;
        }
        void InsertAtTail(int val){
            Listnode temp=new Listnode(val);
           if(tail==null) head=tail=temp;
           else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
           }
           size++;
    }
    void deleteAtHead(){
        if(head==null){ System.out.println("no head");
        return;}
        if(head.next==null||size==1) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    void deleteAttail(){
        if(tail==null) {
            System.out.println("no tail ");
            return ;
        }
        if(head.next==null||size==1) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void display(){
         Listnode temp=head;
         while(temp!=null){
             System.out.println(temp.val+"  ");
             temp=temp.next;
         }
    }
     void displayrev(){
         Listnode temp=tail;
         while(temp!=null){
             System.out.println(temp.val+"  ");
            temp=temp.prev;
         }
    }
    void insertAt(int idx,int val){
        if(idx<0||idx>size){
         System.out.println("not possible");
         return;
         }
         if(size==0){
            insertAthead(val);
            return;
         }
         if(size==idx){
            InsertAtTail(val);
            return;
         }
        else{
            Listnode a=new Listnode(val);
            Listnode temp=head;
            for (int i = 1; i <idx; i++) {
                temp=temp.next;
            }
            a.next=temp.next;
            a.prev=temp;
            temp.next=a;
            a.next.prev=a;
        }
    }
    }
    public static void main(String[] args) {
        DLL list=new DLL();
        list.InsertAtTail(10);
        list.InsertAtTail(20);
        list.InsertAtTail(30);
        // list.display();
        // System.out.println();
        // list.displayrev();
        // System.out.println(list.size);
    //     list.deleteAtHead();
    //    list. deleteAtHead();
    //    list.deleteAtHead();
    //    list.deleteAtHead();
        list.display();
        
        
    }
}
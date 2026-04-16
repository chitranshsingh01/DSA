public class HeadTail{
   static class node{
        int val;
        node next;
        node(int val){
            this.val=val;   
        }
    }
static class linkedlist{
    node Head;
    node Tail;
    int size;

void addAtTail(int val){
    node temp =new node(val);

        if(Tail==null) Head=Tail=temp;
        else{
            Tail.next=temp;
            Tail =temp;; 
        }
        size++;
    }
    void addAtHead(int val){
        node temp=new node(val);
        if(Head==null) Head=Tail=temp;
        else{
            temp.next=Head;
            Head=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(Head==null) System.out.println("list is empty");
       Head=Head.next;
       size--;
    }
    void deleteAtTail(){
        if(Tail==null) return;
            if (Head.next == null) { 
        Head = Tail = null;
        return;
    }
            node temp=Head;
            while(temp.next!=Tail){
                temp=temp.next;
            }
            temp.next=null;
            Tail=temp;
            size--;
        
    }
    void disp(){
        node temp=Head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println("size is: "+size);
        
    }
    boolean search(int x){
        node temp=Head;
        while (temp!=null) {
            if(temp.val==x){
                return true;
            }
            temp=temp.next;
        }
        return false;
 }
 void addAtidx(int idx,int val){
    if(idx>size||idx<0) System.out.println("impossible");
    else{
    node temp=Head;
    node t=new node(val);
    for(int i=0;i<idx-1;i++){
        temp=temp.next;
    }
    t.next=temp.next;
    temp.next=t;}
 }
 void deleteAtidx(int idx){
    if(Head==null) System.out.println("empty");
    else if(idx<0||idx>size) System.out.println("not possible");
    else{
        node temp=Head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
 }
 }
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.addAtHead(40);
        list.disp();
        System.out.println();
        list.addAtHead(1);
        list.addAtTail(99);
        list.disp();
        System.out.println();
        list.deleteAtHead();
        list.deleteAtTail();    
        list.disp();
       System.out.println( list.search(20));
       System.out.println( list.search(90));
    list.addAtHead(10);
    list.addAtTail(20);
    list.addAtTail(30);
    list.addAtTail(40);
    list.addAtTail(50);
    list.addAtTail(60);
       list.addAtidx(2,25);
       list.addAtidx(99,25);
       list.disp();
       list.deleteAtidx(2);
       list.disp();
       list.deleteAtidx(4);
       list.disp();
    }
}

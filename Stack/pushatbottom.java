import java.util.*;
public class pushatbottom {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        int element =50;
        System.out.println(stack);
        push(stack,element);
         System.out.println(stack);

        
    }
    public static void push(Stack<Integer> stack,int ele){
        if(stack.size()==0){
            stack.push(ele);
            return ;
        }
        int top=stack.pop();
        push(stack,ele);
        stack.push(top);

    }
    
}

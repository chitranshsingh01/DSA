package ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class revlist {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            int temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j++;

        }
        System.out.println(list);
        Collections.reverse(list);
        // ArrayList<Integer> arr2=new ArrayList<>();
    }
    
}

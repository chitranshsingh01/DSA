package ArrayList;

import java.util.ArrayList;

public class first {
    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        // arr.clear();
        System.out.println(arr);
        arr.set(4, 10);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);

    }
    
}

package array.ArrayList;

import java.util.ArrayList;

public class creation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
   /*
        -> The toString() method converts an array list to a string
        ->The toString() method presents inside the object class. The ArrayList class does
           not have its own toString() method. It overrides this method from the object class.

    */
        System.out.println(list.toString());
    }
}

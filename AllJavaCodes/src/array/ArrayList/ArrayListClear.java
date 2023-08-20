package array.ArrayList;

import java.util.ArrayList;

public class ArrayListClear {
    public static void main(String[] args) {
        ArrayList<String> user = new ArrayList<>();
        user.add("Kunal");
        user.add("jayPrakash");
        user.add("Maa");
        user.add("Papa");

/*
        Arraylist.clear();

            -> clear() method is used clear whole object(Arraylist).
            -> it does not return anything rather it do changes in object(Arraylist)
 */
        System.out.print("Before Clear() method :- ");
        System.out.println(user);
        user.clear();
        System.out.print("After clear() method :- ");
        System.out.println(user);

    }
}

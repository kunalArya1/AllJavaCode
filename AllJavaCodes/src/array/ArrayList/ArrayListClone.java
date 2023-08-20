package array.ArrayList;

import java.util.ArrayList;

public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(35);
        list.add(45);

        ArrayList<Integer> newLList = new ArrayList<>();
/*
           Arraylist.clone();

                Syntax :-
                    -> ArrayList.clone()
                    -> Parameters: This method does not take any parameters.
                    -> Return Value: This function returns a copy of the instance of Linked list.
*/
        newLList = (ArrayList)list.clone();
        newLList.add(60);
        newLList.add(87);
        System.out.println(newLList);
    }
}

package AllJavaCodes.src.array.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(20);
        list.add(30);
        list.add(35);
        list.add(50);
/*
        Java ArrayList iterator();

        Syntax :-
                    Arraylist.iterator();

              ->  iterator() do not take any parameter
              ->  returns an iterator to loop through the arraylist elements
              ->  The iterator returned by the method is stored in the variable of interface "Iterator" type.
                        code:- Iterator<Datatype> variable_name = arraylist.iterator();

              ->  Using iterator we can access the element of ArrayList
                    1. hasNext();  // return true if there is a next element in the arraylist
                    2. next();    //  return the next element in arraylist

 */
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}

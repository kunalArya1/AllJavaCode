package array.ArrayList;

import java.util.ArrayList;

public class add_addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


 /*
            ArrayList.add(element to be added);

            -> add() method is used to add elements in an arraylist.

*/
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

/*
            Arraylist.add(index,Element to be added);

            -> add() method is used to add elements in an arraylist with the location.
            -> if index is not proper then it will give indexOutOfBound Exception.
            -> it will not replace rather it will move the previous element to the next index and then
               insert at given index.

*/
        list.add(2,100);
        list.add(4,500);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(60);
        list2.add(70);
/*
        Arraylist.addAll();
                1. addAll() can add all the element of arraylist to end of another arraylist.
                2. we can also specify the index where we want append the elements at a particular
                   position.

        syntax:

            1. Arraylist.addAll( Collection c)
                  -> parameter it takes another Arraylist
                  -> return true , if the require changes occurs.
                  -> UnsupportedOperationException : if this list does not support the addAll operation
                  -> NullPointerException : if arraylist doesn't contain any value i.e. if It is null.

            2. Arraylist.addAll( index i , Collection c );
                  -> parameter it takes index and another Arraylist.
                  -> return true ,if the require changes occurs.
                  -> UnsupportedOperationException : if this list does not support the addAll operation
                  ->NullPointerException : if arraylist doesn't contain any value i.e. if It is null.




 */

        list.addAll(list2);

        list.addAll(3,list2);

        System.out.println(list.toString());
    }
}

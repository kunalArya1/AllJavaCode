package AllJavaCodes.src.array.ArrayList;

import java.util.ArrayList;

public class lastIndexof {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


 /*
        ArrayList.lastIndexOf(element to be search take as object );

       -> found in java.util.ArrayList package
       -> This method is used to find the last occurrence of the element in the arraylist

       Syntax :-

                ArrayList.LastIndexOf(element to be searched);

         Return :-
                1. Return the last index of the element if it is present in the list.
                2.Return -1 if the element is not present in the list.


          Code :-
               System.out.println(list.lastIndexOf(30));

  */


        System.out.println(list.lastIndexOf(40));
    }
}

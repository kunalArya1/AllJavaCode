package AllJavaCodes.src.array.ArrayList;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(45);
        list.add(89);
        list.add(99);

/*
        ->contains() method is used to checks whether the given element is present in the arraylist or not.
        -> Parameter : takes element to be searched
        -> Return : return true ,if element is present in arraylist else return false

  */
        System.out.println(list.contains(99));

    }
}

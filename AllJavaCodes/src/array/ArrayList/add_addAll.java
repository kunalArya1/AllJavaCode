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

//        list.addAll(list2);

        list.addAll(3,list2);

        System.out.println(list.toString());



//        System.out.println(list.toString());
    }
}

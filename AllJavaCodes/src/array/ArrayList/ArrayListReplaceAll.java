package AllJavaCodes.src.array.ArrayList;

import java.util.ArrayList;

public class ArrayListReplaceAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(23);
        list.add(46);
        list.add(56);
        list.add(45);
        list.add(34);

/*
        Arraylist.replaceAll();

        Syntax:-
                    arraylist.replaceAll(UnaryOperator<E> operator);

         parameter:-
                    -> The replaceAll() method takes a single parameter.
                    -> operator - operation to be applied to each element

          Return :-
                    -> Do not return any value
                    -> it replace each element of arraylist

          Parameter as LambdaExpression:
                    arraylist.replaceAll(e -> e+10); // this is how we use

*/
        list.replaceAll(e -> e-10);
        System.out.println(list.toString());


    }
}

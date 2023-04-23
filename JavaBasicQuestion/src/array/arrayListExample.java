package array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(9);
        arr.add(10);
        arr.add(90);
        arr.add(100);
        arr.add(120);
        System.out.println(arr);


        // for input
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}

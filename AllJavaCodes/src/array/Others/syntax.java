package array.Others;

import java.util.Arrays;
import java.util.Scanner;

public class syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int [5];
        System.out.print("Enter element of array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Basic;

import java.util.Scanner;
//73- Mean of array elements.
public class Q_73_MeanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input at index " + i + " :- ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Mean of Array is :- " + (sum/ arr.length));

    }
}

package Basic;

import java.util.Scanner;
//72- Accept size n from user and create a n size array then take n inputs
//into the and finally Print the sum of all elements in the array in the
//following manner
//10 + 20 + 30 = 60
public class Q_72_NSizeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        //for input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input at index " + i  +" :- ");
            arr[i]= sc.nextInt();
        }
        //for output
        System.out.print("Sum is : ");
        System.out.print(arr[0]);
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(" + " + arr[i] );
        }

        System.out.print(" = " + sum);


    }
}

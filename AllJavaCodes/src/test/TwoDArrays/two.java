package test.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //             -->DECLERATION OF TWO-D ARRAYS

        int[][] arr;
        int[] arr2[];
        int arr3[][];

//              -->DECLERATION AND INITIALIZATION OF TWO-D ARRAYS

        int[][] arr4 = new int[4][5];
        int[] arr5[] = new int[4][5];
        int arr6[][] = new int[5][6];
        int[][] arr7 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        //             -->TAKING INPUT IN TWO-D ARRAYS

        for (int i = 0; i < arr7.length; i++) {
            for (int j = 0; j < arr7[0].length; j++) {
                System.out.println("Enter element at " + i + " and " + j + " index :- ");
                arr7[i][j] = sc.nextInt();
            }


//              -->PRINTING THE ELEMENT OF THE TWO-D ARRAYS

        for (int k = 0; k < arr7.length; k++) {
            for (int j = 0; j < arr7[0].length; j++) {
                System.out.print(arr7[k][j]+ " ");

            }
            System.out.println("");
        }
//


//              -->PRINTING THE ELEMENT OF THE TWO-D ARRAYS USING TOSTRING() METHOD

        for (int l = 0; l < arr7.length; l++) {
            System.out.println(Arrays.toString(arr7[l]));
        }
        }
    }
}

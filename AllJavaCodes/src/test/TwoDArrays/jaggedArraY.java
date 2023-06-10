package test.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class jaggedArraY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //jagged array declaration and initialization
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];


//      --> ANOTHER WAY

        int arr2[][] = new int[][] {
                new int[] {1,2,3,4},
                new int[] {4,5,6,7,8,9},
                new int[] {1,2,3},
                new int[] {0,1,2,3,4,5,6,7,8,9}
        };

//      --> ANOTHER WAY

        int [][] arr3 = {
                new int[] {1,2,3,4},
                new int[] {4,5,6,7,8,9},
                new int[] {1,2,3},
                new int[] {0,1,2,3,4,5,6,7,8,9}
        };


//      --> ANOTHER WAY

        int [][] arr4 = {
                {1,2,3,4},
                {4,5,6,7,8,9},
                {1,2,3},
                {0,1,2,3,4,5,6,7,8,9}
        };

//      --> FOR TAKING INPUT IN JAGGED ARRAY

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter Element at "+ i + " and " + j + " Index :- ");
                arr[i][j]= sc.nextInt();
            }
        }

//      --> FOR PRINTING THE ELEMENT OF JAGGED ARRAY USING FOR-EACH

        for (int [] elm: arr) {
            System.out.println(Arrays.toString(elm));
        }

//      --> FOR PRINTING THE ELEMENT OF JAGGED ARRAY USING FOR-EACH

        for (int [] elm: arr2) {
            System.out.println(Arrays.toString(elm));
        }

//      --> FOR PRINTING THE ELEMENT OF JAGGED ARRAY

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }


    }
}

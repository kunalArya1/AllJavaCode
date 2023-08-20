package AllJavaCodes.src.test.Arrays;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       --> DECLERATION OF ARRAY

//      DATATYPE [] VARIABLE_NAME;
//      DATATYPE VARIABLE_NAME [];
        int arr1[];
        int []arr2;

 //     --> DECLERATION AND INITILIZATION OF ARRAYS

//        DATATYPE [] VARIABLE_NAME = new DATATYPE[SIZE OF ARRAY];
          int [] arr3 = new int[10];
          int arr4 [] = new int[10];
          int arr [] = {1,2,3,4,9,6,7,8,9,10};

//      --> TAKING INPUT IN ARRAY

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

//      --> FOR PRINTING THE ELEMENT OF ARRAYS

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

//      --> FOR PRINTING THE ELEMENT THE ARRAYS USING THE FOR-EACH LOOP

        for (int x:arr) {
            System.out.print((x) + " ");
        }


    }


}

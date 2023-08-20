package AllJavaCodes.src.array.Operations.Inseration;

import java.util.Arrays;

public class InsertAtEnd {
    public static void main(String[] args) {
        int arr[] ={10,30,40,50,70,90};

        System.out.println(Arrays.toString(insertAtEnd(arr,100)));
    }

    public static int[] insertAtEnd(int arr[], int number){
        int temp [] = new int[arr.length+1];
//        System.out.println(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = number;
        return temp;
    }
}

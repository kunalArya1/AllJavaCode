package AllJavaCodes.src.array.Operations.Deletion;

import java.util.Arrays;

public class deleteAtEnd {
    public static void main(String[] args) {
        int arr[] ={10,40,11,20,405,6090,90000};
        System.out.println(Arrays.toString(delteAtEnd(arr)));
    }
    public static int[] delteAtEnd(int arr[]){
        int new_arr [] = new int [arr.length-1];
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] = arr[i];
        }

        return new_arr;
    }
}

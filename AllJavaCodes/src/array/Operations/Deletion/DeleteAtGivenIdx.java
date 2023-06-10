package array.Operations.Deletion;

import java.util.Arrays;

public class DeleteAtGivenIdx {
    public static void main(String[] args) {
        int arr [] ={10,40,50,60,70,20,11,44,55};
        System.out.println(Arrays.toString(deleteAtGivenIndex(arr,6)));
    }

    public static int[] deleteAtGivenIndex(int arr[],int idx){
        int new_arr [] = new int[arr.length-1];
        for (int i = 0; i < idx; i++) {
            new_arr[i] = arr[i];
        }
        for (int i = idx; i < new_arr.length; i++) {
            new_arr[i] = arr[i+1];
        }
        return new_arr;
    }
}

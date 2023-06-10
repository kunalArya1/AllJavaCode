package array.questions;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] ={ 10,0,30,0,50,60,0,90,0,60,70};
        System.out.println(Arrays.toString(move_zero_to_end(arr)));
    }
    public static int[] move_zero_to_end(int arr[] ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-2; j++) {
                if(arr[i] ==0){
                    int temp = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}

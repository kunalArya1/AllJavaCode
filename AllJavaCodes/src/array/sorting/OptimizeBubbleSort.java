package array.sorting;

import java.util.Arrays;

public class OptimizeBubbleSort {
    public static void main(String[] args) {
        int arr[] ={1,8,3,5,6,7};
        System.out.println(Arrays.toString(bubbleSortForsorted(arr)));
    }
    public static int[] bubbleSortForsorted(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int swap =0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0){
                return arr;
            }
        }
        return arr;
    }
}

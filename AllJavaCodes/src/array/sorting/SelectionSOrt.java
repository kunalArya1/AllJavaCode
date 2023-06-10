package array.sorting;

import java.util.Arrays;

public class SelectionSOrt {
    public static void main(String[] args) {
        int arr[] = {10,30,11,6,7,-2,5,-1,-15};
        System.out.println(Arrays.toString(selectionSort(arr)));
     }
    public static  int[] selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

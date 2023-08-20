package AllJavaCodes.src.array.sorting;

import java.util.Arrays;

public class BubbleSOrt {
    public static void main(String[] args) {
        int arr[] ={10,50,40,60,30,15,12};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    public static int[] bubblesort(int arr[]){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 0; j <= ((arr.length-2)-i); j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}

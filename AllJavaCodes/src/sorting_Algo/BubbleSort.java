package AllJavaCodes.src.sorting_Algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,70};
        boolean swappped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]< arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swappped= true;
                }
            }
        }
        if ( !swappped){
            System.out.println("Already sorted ");
        }
        System.out.println(Arrays.toString(arr));
    }
}


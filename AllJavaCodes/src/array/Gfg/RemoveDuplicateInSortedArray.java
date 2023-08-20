package AllJavaCodes.src.array.Gfg;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,5,6,6,7,8,8,8,9};
//        System.out.println(Arrays.toString(removeDuplicateNavie(arr)));
        System.out.println(Arrays.toString(removeDuplicateOptimize(arr)));

    }
    public static int[] removeDuplicateNavie(int arr[] ){
        int [] temp = new int[arr.length];
        temp[0] =arr[0];
        int tempIdx =1;
        for (int i = 1; i < arr.length; i++) {
            if (temp[tempIdx-1] != arr[i]){
                temp[tempIdx] = arr[i];
                tempIdx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    public static int[] removeDuplicateOptimize(int [] arr){
        int res =1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[res-1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        for (int i = res; i < arr.length; i++) {
            arr[i] =0;
        }
        return arr;
    }
}

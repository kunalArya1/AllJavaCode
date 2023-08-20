package AllJavaCodes.src.array.Gfg;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,5,6,0,7,0,9};
        System.out.println(Arrays.toString(moveZeroEnd(arr)));
    }
    public static int[] moveZeroEnd(int []arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] =arr[i-1];
                arr[i-1] = temp;
            }
        }
        return  arr;
    }
}

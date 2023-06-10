package array.Others;

import java.util.Arrays;

public class inseration {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,8};
        int position = 1;
        int ele = 50;
        for (int i = arr.length-1; i > position-1 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[position-1]=ele;
        System.out.println(Arrays.toString(arr));
    }
}

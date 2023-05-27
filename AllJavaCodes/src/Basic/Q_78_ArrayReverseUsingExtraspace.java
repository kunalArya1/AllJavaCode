package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

//78- Array Reverse Using Extra space
public class Q_78_ArrayReverseUsingExtraspace {
    public static void main(String[] args) {
        int [] arr = {4,8,9,5,6,1,3};
        int [] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[(arr.length-1)-i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}

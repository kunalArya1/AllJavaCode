package array.Operations.Inseration;

import java.util.Arrays;

public class insertatany {
    public static void main(String[] args) {
        int arr[] ={10,30,43,50,60,14};
        System.out.println(Arrays.toString(insertAtAnyIndex(arr, 1, 65)));
    }
    public static int[] insertAtAnyIndex(int arr[] ,int idx,int elem){
        int arr2[] = new int[arr.length+1];
        for (int i = 0; i < idx; i++) {
            arr2[i] = arr[i];
        }
        arr2[idx] = elem;
        for (int i = idx+1; i < arr2.length; i++) {
            arr2[i] = arr[i-1];
        }
        return arr2;
    }
}

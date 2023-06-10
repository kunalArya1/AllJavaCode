package array.Operations.Inseration;

import java.util.Arrays;

public class inserend {
    public static void main(String[] args) {
       int arr[] ={ 1,4,5,7,8,9,10};
       int elem = 90;
        System.out.println(Arrays.toString(insertAtEnd(arr,elem)));
    }

    public static int[] insertAtEnd(int []arr,int elem){
       int arr2[] = new int [arr.length+1];
        for (int i = 0; i < arr2.length -1 ; i++) {
            arr2[i] = arr[i];
        }

        arr2[arr2.length-1] = elem;

        return arr2;

    }
}

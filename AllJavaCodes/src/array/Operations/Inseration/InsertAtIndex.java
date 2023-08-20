package AllJavaCodes.src.array.Operations.Inseration;

import java.util.Arrays;

public class InsertAtIndex {
    public static void main(String[] args) {
        int arr[] ={10,30,40,50,70,90};

        System.out.println(Arrays.toString(insertatidx(arr,2,20)));
    }
    public static int[] insertatidx(int arr[],int idx,int number){
        int temp[] = new int[arr.length+1];
        for (int i = 0; i < idx; i++) {
            temp[i] = arr[i];
        }
        temp[idx] = number;
        for (int i = idx+1; i <= arr.length; i++) {
            temp[i] =arr[i-1];
        }
        return temp;
    }
}

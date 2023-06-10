package array.Others;

import java.util.Arrays;

public class deletionArray {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int delElement = 20;
//        for (int i = 0; i < arr.length; i++) {
//            if (delElement == arr[i]) {
//                for (int j = i; j < arr.length - 1; j++) {
//                    arr[j] = arr[j + 1];
//                }
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int index = delsearch(arr,delElement);
        delete(arr,index);


    }
    public static void delete(int arr[],int i){
        for (int j = i; j < arr.length-1; j++) {
            arr[j]=arr[j+1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int delsearch(int arr[],int delele){
        for (int i = 0; i < arr.length; i++) {
            if (delele == arr[i]){
                return i;
            }
        }
        return -1;
    }
}

package AllJavaCodes.src.array.questions;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {10,5,30,50,60,70};
        System.out.println(checkSorted(arr));
    }
    public static boolean checkSorted(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i])
                return false;
        }
        return true;
    }
}


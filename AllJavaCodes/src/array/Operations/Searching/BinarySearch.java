package array.Operations.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        System.out.println(Binarysearch(arr,1000000000));
    }

    public static int Binarysearch(int arr[] ,int target ){
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end)/2;

            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

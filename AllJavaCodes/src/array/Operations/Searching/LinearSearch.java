package AllJavaCodes.src.array.Operations.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,45,67,89,90,34,46,78};
        System.out.println(linearsearch(arr,80));
    }

    public static int linearsearch(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}


package AllJavaCodes.src.array.questions;

public class SecondLargest {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        int arr[] ={-1,-10,-50,-7,-2,-3};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                sMax = max;
                max=arr[i];
            }
        }
        System.out.println("Largest Value :- " + max +" And Second Largest value :- " + sMax);
    }
}

package Basic;

import java.util.Arrays;

//85- Pallindromic array - Write a program to check if elements of an array are same or
// not it read from front or back
//Example : arr= [2,3,15,15,3,2]
public class Q_85_PallindromicArray {
    public static void main(String[] args) {
        int  []arr= {2,3,15,3,2};
        int mid = (arr.length/2);
        boolean ispall = false;
        for (int i = 0; i <= mid; i++) {
            if (arr[i] == arr[(arr.length-1)-i]){
                ispall = true;
            }else{
                ispall = false;
            }
        }
        System.out.println("Given array :  " + Arrays.toString(arr));
        if (ispall == true){
            System.out.println("Given array is a Pallindromic array");
        }else{
            System.out.println("Given array is not a Pallindromic array");
        }
    }
}

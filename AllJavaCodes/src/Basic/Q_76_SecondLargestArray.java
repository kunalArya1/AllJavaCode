package Basic;

import java.util.Arrays;
import java.util.Scanner;
//76- Find the second-greatest element
//{2, 96, 69, 77, 145, 20} = Second greatest element = 96
public class Q_76_SecondLargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Input at index " + i + " :- ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int gNumber = 0;
        int sgnum = 0;
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > gNumber){
                sgnum = gNumber;
                gNumber = arr[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Greatest Number is :- " + sgnum);
    }
}


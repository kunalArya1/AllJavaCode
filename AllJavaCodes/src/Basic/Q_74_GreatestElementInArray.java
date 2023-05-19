package Basic;

import java.util.Scanner;
//74- Find the greatest element and print its index too.
//{2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index
public class Q_74_GreatestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Input at index " + i + " :- ");
            arr[i] = sc.nextInt();
        }
        int gNumber = 0;
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > gNumber){
                gNumber = arr[i];
                index = i;
            }
        }
        System.out.println("Greatest Number is :- "+ gNumber +" and found at index :- " + index);
    }
}

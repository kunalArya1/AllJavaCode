package Basic;

import java.util.Scanner;
//75- Find the smallest element and print its index too.
//{2, 96, 69, 77, 145, 20} = Min element = 2 found at 0 index
public class Q_75_SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Input at index " + i + " :- ");
            arr[i] = sc.nextInt();
        }
        int sNumber = arr[0];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sNumber){
                sNumber = arr[i];
                index = i;
            }
        }
        System.out.println("Smallest Number is :- "+ sNumber +" and found at index :- " + index);

    }
}

package Basic;
//87- Linear Search an array - If element found print the index else -1
import java.util.Scanner;

public class Q_87_LinearSearchAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to search :- ");
        int num = sc.nextInt();
        int [] arr = { 45,58,89,65,60 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                System.out.println("Number found at index " + i );
                break;
            }
            else {
                System.out.println("not found ");
                break;
            }
        }
    }
}

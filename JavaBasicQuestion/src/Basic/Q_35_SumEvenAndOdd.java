package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Print the sum of all even & odd numbers in a range seperately.
public class Q_35_SumEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum =0;
        for (int i = 1; i <= n ; i++) {
           if (i % 2 == 0){
               evenSum += i;
           }else {
               oddSum += i;
           }
        }
        System.out.println("Sum Of Even Number :- " + evenSum);
        System.out.println("Sum of Odd Number :- " + oddSum);

    }
}

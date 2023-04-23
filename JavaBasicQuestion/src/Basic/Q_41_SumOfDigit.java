package Basic;

import java.util.Scanner;

//Sum of digits of a number, 936 = 18
public class Q_41_SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int digitSum = 0;
        while (num >0){
            int digit = num%10;
            digitSum += digit;
            num = num /10;

        }
        System.out.println("Sum of Digit :- " + digitSum);

    }
}

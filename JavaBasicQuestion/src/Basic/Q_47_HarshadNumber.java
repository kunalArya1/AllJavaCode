package JavaBasicQuestion.src.Basic;


import java.util.Scanner;

//Accept a number and check if it is a Harshad number
//      Harshad number is a number or an integer which is completely divisible by sum of  its digits.
//      Ex - 24 = Sum of 2+4 = 6 & 24%6 = 0
public class Q_47_HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int temp = num;
        int digitSum = 0;
        while (num > 0){
            int digit = num % 10;
            digitSum += digit;
//            System.out.println(digit);
            num = num  / 10 ;
        }
        if (temp % digitSum == 0 ){
            System.out.println("Given Number is a Harsad Number");
        }
        else System.out.println("Given Number is not a Harsad Number");

    }
}

package JavaBasicQuestion.src.Basic;


import java.util.Scanner;

//Accept a number and check if it is a armstrong number (Sum of cube of all digits will be equal to origional number)
//       Ex - 407 = 64 + 0 + 343 = 407
//              153 = 1 + 125 + 27 = 153
public class Q_45_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int temp = num;
        double sumSqu = 0;
        while ( num > 0 ){
            int digit = num % 10;
            sumSqu += Math.pow(digit,3);
            num = num / 10;
        }
        if (temp == sumSqu){
            System.out.println("Given Number is a Armstrong Number");
        }else System.out.println("Given Number is not a Armstrong Number");

    }
}

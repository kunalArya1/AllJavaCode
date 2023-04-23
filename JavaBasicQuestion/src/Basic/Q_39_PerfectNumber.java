package Basic;

import java.util.Scanner;

//Accept a number and check if it a perfect number or not.A number whose sum of factors(excluding number itself)  = Number
//Ex -  6 = 1, 2, 3 = 6
public class Q_39_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int factSum = 0;
        for (int i = 1; i <= (num/2) ; i++) {
            if (num % i ==0){
                factSum += i;
            }
        }
        if (factSum ==num){
            System.out.println("Given Number is a Perfect Number");
        }
        else System.out.println("Given Number is not a Perfect Number");
    }
}

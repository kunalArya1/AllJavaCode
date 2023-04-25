package Basic;

import java.util.Scanner;

public class Q_3_SumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Sum of Two Number : " + sumOfTwoNum(a,b));
    }
    public static int sumOfTwoNum(int a,int b){
        return (a+b);
    }
}


package JavaBasicQuestion.src.Basic;


import java.util.Scanner;

//Factorial of a number
public class Q_34_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = (factorial * i);
        }
        System.out.println("Factorial is :- " + factorial);
    }
}

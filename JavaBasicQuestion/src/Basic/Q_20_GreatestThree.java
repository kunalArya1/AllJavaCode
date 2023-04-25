package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Accept three numbers and print the greatest among them
public class Q_20_GreatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int a = sc.nextInt();
        System.out.print("Enter second number :- ");
        int b = sc.nextInt();
        System.out.print("Enter third number :- ");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("First Number is Greater");
        } else if (b>a && b>c) {
            System.out.println("Second Number is Greater");
        }else {
            System.out.println("Third Number is Greater");
        }
    }
}

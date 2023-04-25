package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Reverse for loop. Print n to 1.
public class Q_31_NToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

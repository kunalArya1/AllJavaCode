package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Take a number as input and print its table
//       5 * 1 = 5
//       5 * 2 = 10 ... up to 10 terms
public class Q_32_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num +" * " + i +" = " + (num*i));
        }
    }
}

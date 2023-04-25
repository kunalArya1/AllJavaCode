package Basic;

import java.util.Scanner;

//Print natural number up to n.
public class Q_30_N_NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}

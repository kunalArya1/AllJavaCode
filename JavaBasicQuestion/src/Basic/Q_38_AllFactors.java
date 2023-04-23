package Basic;

import java.util.Scanner;

//Print all the factors of a number.
public class Q_38_AllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :- ");
        int num = sc.nextInt();
        for (int i = 1; i <= (num/2); i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }

    }
}

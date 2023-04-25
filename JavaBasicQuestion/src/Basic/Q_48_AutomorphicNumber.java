package Basic;


import java.util.Scanner;

//Automorphic number 5 = 25 = 625 = 390625
public class Q_48_AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        double squNum = Math.sqrt(num);
        System.out.println(squNum);

    }
}

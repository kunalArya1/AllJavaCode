package Basic;

import java.util.Scanner;
//70- Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21...
public class Q_70_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int n1 = 0 ,n2 = 1, n3 ;
        System.out.print(n1 +" , " + n2);
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.print(" , " + n3 );
            n1=n2;
            n2=n3;
        }


    }
}

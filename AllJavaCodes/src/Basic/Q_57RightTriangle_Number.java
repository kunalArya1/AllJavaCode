package Basic;

import java.util.Scanner;

//	1
//	1 2
//	1 2 3
//	1 2 3 4
//	1 2 3 4 5
public class Q_57RightTriangle_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }
}

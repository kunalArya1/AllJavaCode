package Basic;

import java.util.Scanner;
//	A
//	A B
//	A B C
//	A B C D
//	A B C D E
public class Q_58_RightTriangle_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print((char)(65+j) +" ");
            }
            System.out.println("");
        }
    }
}

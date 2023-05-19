package Basic;

import java.util.Scanner;

public class Q_65_V_Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= (2*num); j++) {
                if ((i-j == 0) || (i+j == 8)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

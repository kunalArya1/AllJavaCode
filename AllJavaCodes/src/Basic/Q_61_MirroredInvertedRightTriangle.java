package Basic;

import java.util.Scanner;

//  * * * * *
//	  * * * *
//	    * * *
//	      * *
//	        *
public class Q_61_MirroredInvertedRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" " +" ");
            }
            for (int j = n; j >= i ; j--) {
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }
    }

}

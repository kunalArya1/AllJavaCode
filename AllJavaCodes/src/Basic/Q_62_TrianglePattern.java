package Basic;

import java.util.Scanner;

//      *
//	   * *
//	  * * *
//	 * * * *
//	* * * * *
public class Q_62_TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        method1(n);
        method2(n);
    }
    public static  void method1(int n){
        //for outer
        for (int row = 1; row <= n ; row++) {
            //for space
            for (int col = n; col >= row; col--) {
                System.out.print(" ");
            }
            //for star print
            for (int col = 1; col <= row ; col++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void method2(int n){
        //for outer
        for (int row = 1; row <= n ; row++) {
            for (int col = n; col >= 1; col--) {
                    if (col>row){
                        System.out.print(" ");
                    }
                    else System.out.print(" *");
            }
            System.out.println("");
        }
    }
}

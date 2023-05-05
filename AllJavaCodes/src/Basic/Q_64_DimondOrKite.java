package Basic;

import java.util.Scanner;

//       *
//	    * *
//	   * * *
//	  * * * *
//	 * * * * *
//	* * * * * *
//	 * * * * *
//	  * * * *
//	   * * *
//	    * *
//	     *
public class Q_64_DimondOrKite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dimondPattern(n);
        }
        public static void dimondPattern(int n ){
            for (int row = 0; row < 2*n; row++) {
                int noOfcol = row > n ? 2*n -row : row;
                int noOfSpace = n - noOfcol;
                for (int space = 0; space < noOfSpace ; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star <  noOfcol; star++) {
                    System.out.print("* ");
                }
                System.out.println("");

            }
        }

    public static class Q_65_V_MinHeight_3 {
        public static void main(String[] args) {

        }
    }
}


package ArrayC;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Datatype [size] name;
        double test [] = new double[4];
        // input

        for (int i = 0; i < test.length; i++) {
//            System.out.println("Enter numbers : ");
            test[i] = sc.nextInt();
        }

//        for (int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
//        System.out.println(test[1]);

        System.out.println(Arrays.toString(test));

        // Operation

            // Inseration
            // Deletion
            //Updation
            //Shifting
        // Rotation
     }
}

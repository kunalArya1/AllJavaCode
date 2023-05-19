package Basic;

import java.util.Scanner;
//69- Find the LCM of two numbers
public class Q_69_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int maxNum;
        for (maxNum = Math.max(num1, num2); maxNum <= (num1*num2) ; maxNum++){
            if (maxNum % num1 == 0 && maxNum % num2 == 0 )
                break;
        }
        System.out.println("LCM of given number is :- " + maxNum);
    }
}

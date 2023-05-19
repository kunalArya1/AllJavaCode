package Basic;

import java.util.Scanner;

public class Q_68_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number :- ");
        int num2 = sc.nextInt();
        int minNum;
        for (minNum = num1<num2 ? num1 : num2;minNum > 0 ; minNum--) {
            if (num1 % minNum == 0 && num2 % minNum == 0){
                break;
            }
        }
        System.out.println("Hcf of "+ num1 + " and " + num2 +" is " + minNum);
    }
}

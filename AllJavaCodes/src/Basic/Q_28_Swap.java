package Basic;

import java.util.Scanner;

//Accept two numbers from user and swap their values
//Part 2 - Swap without using third variable
public class Q_28_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number :- ");
        int fNum = sc.nextInt();
        System.out.print("Enter second number :- ");
        int sNum = sc.nextInt();
        int temp = fNum;
        fNum=sNum;
        sNum=temp;
        System.out.println("Swaped Number is " + " ( "+fNum + " , " +sNum +" ) ");

        //Part 2 - Swap without using third variable
        fNum = fNum+sNum;
        sNum = fNum-sNum;
        fNum = fNum-sNum;
        System.out.println("Swaped Number is " + " ( "+fNum + " , " +sNum +" ) ");
    }


}

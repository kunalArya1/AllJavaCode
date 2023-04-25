package JavaBasicQuestion.src.Basic;

import java.util.Scanner;
//Accept a year and check if it a leap year or not (google to find out what's a leap year)
public class Q_21_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :- ");
        int year = sc.nextInt();
        if ((year % 4 ==0 && year % 100 != 0) || (year % 400 ==0)){
            System.out.println("Given Year is a Leap year");
        }else {
            System.out.println("Given yera is not a Leap year");
        }
    }
}

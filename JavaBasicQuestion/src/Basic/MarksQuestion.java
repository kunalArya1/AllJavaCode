package Basic;

import java.util.Scanner;

// Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ),
//Write a program to calculate his total marks and percentage marks.
public class MarksQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your math mark : ");
        int math = sc.nextInt();
        System.out.print("Enter your computer marks : ");
        int computer = sc.nextInt();
        System.out.print("Enter your english marks : ");
        int english = sc.nextInt();
        System.out.println("Your total marks are : "+ totalMarks(math,computer,english));
        System.out.println("Your percentage is : "+Percentage(math,computer,english)+"%");
    }
    public static int totalMarks(int math,int computer,int english){
        return (math+computer+english);
    }
    public static int Percentage(int math,int computer,int english){
        return ((math+english+computer)/3);
    }
}

package Basic;

import java.util.Scanner;

// Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ),
//Write a program to calculate his total marks and percentage marks.
public class Q_7MarksQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your math mark : ");
        int math = sc.nextInt();
        System.out.print("Enter your computer marks : ");
        int computer = sc.nextInt();
        System.out.print("Enter your english marks : ");
        int english = sc.nextInt();
        System.out.println("Your total marks are : "+ totalMarks(math,computer,english));
//        System.out.println("Your percentage is : "+Percentage(math,computer,english)+"%");
    }
    public static int totalMarks(int math,int computer,int english){
        return (math+computer+english);
    }
    public static int Percentage(int math,int computer,int english){
        return ((math+english+computer)/3);
    }

    //4- Accept the User's name, age and print in following manner
    //	Ex - Hello Shery, you are 12 years old.
    public static class Q_4_InputExampl {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name :- " );
            String name = sc.nextLine();
            System.out.print("Enter your age :- ");
            int age = sc.nextInt();
            System.out.println("Hello " + name +" , You are " + age + " Years old.");
        }
    }

    public static class Q_3_SumInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first Number : ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int b = sc.nextInt();
            System.out.print("Sum of Two Number : " + sumOfTwoNum(a,b));
        }
        public static int sumOfTwoNum(int a,int b){
            return (a+b);
        }
    }
}

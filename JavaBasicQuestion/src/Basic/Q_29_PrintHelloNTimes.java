package JavaBasicQuestion.src.Basic;


import java.util.Scanner;

//Accept an integer and Print hello world n times
public class Q_29_PrintHelloNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how amny times you want to print hello world :- ");
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            System.out.println("Hello World!");
        }
     }
}


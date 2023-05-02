package Basic;


import java.util.Scanner;

//Make a choice based calculator using do while
public class Q_50_ChoiceBaedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to use calculator: ");
        System.out.println("1 for add");
        System.out.println("2 for sub");
        System.out.println("3 for mul");
        int num;
        do {
            System.out.println("Enter a number :- ");
             num = sc.nextInt();
            if (num == 1){
                System.out.println("You have choosen Addition..");
                System.out.print("Enter two numbers :- ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition is :- " + (a+b));
                System.out.println("===========================================");
            }else if (num == 2){
                System.out.println("You have choosen sub..");
                System.out.print("Enter two numbers :- ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Substraction is :- " + (a-b));
                System.out.println("===========================================");

            }else if(num == 3 ){
                System.out.println("You have choosen Multiplication..");
                System.out.print("Enter two numbers :- ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Multiplicatin is :- " + (a*b));
                System.out.println("===========================================");

            }
            else {
                System.out.println("Wrong input! Try Again ...");
                System.out.println("Bye!!!");
            }
        }while (num >= 0 );
    }
}

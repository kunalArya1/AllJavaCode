package Basic;

import java.util.Scanner;

//Accept the Principle amount, time & rate of interest and calculate the Simple Interest
public class Q_9_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount :- ");
        double amount = sc.nextDouble();
        System.out.print("Enter time :- ");
        double time = sc.nextDouble();
        System.out.print("Enter rate :- ");
        double rate = sc.nextDouble();
        double si = ((amount*time*rate)/100);
        System.out.println("Simple interest is :-  " + si);

    }
}

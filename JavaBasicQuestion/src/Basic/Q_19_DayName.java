package Basic;

import java.util.Scanner;

//Accept a day number between 1-7 and print the corresponding dayname.
public class Q_19_DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day Number (1-7) :- ");
        int dayNum = sc.nextInt();
        switch (dayNum) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong Input ! try again...");
        }

    }
}

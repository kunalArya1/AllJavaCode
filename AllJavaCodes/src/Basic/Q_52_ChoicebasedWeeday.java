package Basic;

import java.util.Scanner;

//Choice based weeday
public class Q_52_ChoicebasedWeeday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a Number :- ");
            num = sc.nextInt();
            if (num == 1) System.out.println("Monday");
            else if (num == 2) System.out.println("Tuesday");
            else if (num == 3) System.out.println("Wednesday");
            else if (num == 4) System.out.println("Thrusday");
            else if (num == 5) System.out.println("Friday");
            else if (num == 6) System.out.println("Saturday");
            else if (num == 7) System.out.println("Sunday");
        }while (num != 0);
    }
}

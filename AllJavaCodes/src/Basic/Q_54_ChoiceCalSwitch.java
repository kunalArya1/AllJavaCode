package Basic;

import java.util.Scanner;
//Choice calc using switch
public class Q_54_ChoiceCalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        switch (num){
            case 1 -> System.out.println("addition");
            case 2 -> System.out.println("substraction");
            case 3 -> System.out.println("Multiplaction");
            default -> System.out.println("Wrong input");
        }

    }
}

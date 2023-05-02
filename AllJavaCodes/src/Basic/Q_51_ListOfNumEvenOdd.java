package Basic;

import java.util.Scanner;

//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers
//from a list of numbers (N) entered by the user.
//The list terminates when the user enters a zero.
public class Q_51_ListOfNumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int pESum = 0;
        int pOSum = 0;
        int nSum = 0;
        do {
            System.out.println("Enter a number :- ");
            num = sc.nextInt();
            if (num < 0){
                nSum += num;
            }
            if (num >0 && num % 2 == 0){
                pESum += num;
            }
            if(num >0 && num % 2 != 0){
                pOSum += num;
            }
        }while(num != 0);
        System.out.println("------------------------------");
        System.out.println("Negative sum :- " + nSum);
        System.out.println("psotive even sum :- " + pESum);
        System.out.println("postive odd sum :- " + pOSum);
        System.out.println("------------------------------");

    }
}

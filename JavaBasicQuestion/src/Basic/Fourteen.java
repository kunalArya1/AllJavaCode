package Basic;

import java.util.Scanner;

//14- Accept an integer and check whether it is an even number or odd.
public class Fourteen {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}

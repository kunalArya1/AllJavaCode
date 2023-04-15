package Basic;


import java.util.Scanner;

//15- Accept name and age from the user. Check if the user is a valid voter or not.
//  Vaid - Hello Shery, You are a valid voter.
//  Invalid - Sorry Shery, you can't cast the vote.
//	Part 2 - Print after how many years the user will be eligible
public class fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String name = sc.nextLine();
        System.out.print("Enter your age :- ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Hello " + name + " , You are a valid voter.");
        }else if (age <= 17){
            System.out.println("You will be eligible after " + (18-age) +" years");
        }
        else {
            System.out.println("Sorry " + name +" , you can't cast the vote.");
        }
    }
}

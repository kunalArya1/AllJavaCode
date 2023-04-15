package Basic;

import java.util.Scanner;

//4- Accept the User's name, age and print in following manner
//	Ex - Hello Shery, you are 12 years old.
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :- " );
        String name = sc.nextLine();
        System.out.print("Enter your age :- ");
        int age = sc.nextInt();
        System.out.println("Hello " + name +" , You are " + age + " Years old.");
    }
}

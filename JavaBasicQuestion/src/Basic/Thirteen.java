package Basic;

import java.util.Scanner;

//13- Extend the previous program and handle the wrong inputs.
// Print Good Morning sir for input m or M & Good morning Maam for input F or f
// else print Wrong Input
public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Gender (M/F) :- " );
        String gender = sc.nextLine();
        char genderChar = gender.charAt(0);
        if (genderChar == 'm' || genderChar == 'M'){
            System.out.println("Good Morning Sir.....");
        } else if (genderChar == 'f' || genderChar == 'F') {
            System.out.println("Good Morning Ma'am....");
        }else {
            System.out.println("Oh! Wrong input...");
        }
    }
}

package Basic;


import java.util.Scanner;

//12- Accept the gender from the user as char and print the respective greeting message
//     Ex - Good Morning Sir (on the basis of gender)
public class Q_12Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender in (M/F) :- ");
        String gender = sc.nextLine();
        char genderChar = gender.charAt(0);
        if (genderChar == 'M'){
            System.out.println("Good Morning Sir.....");
        }else if (genderChar == 'F'){
            System.out.println("Good Morning Ma'am....");
        }
        else {
            System.out.println("Oh! Wrong Input....");
        }
    }
}

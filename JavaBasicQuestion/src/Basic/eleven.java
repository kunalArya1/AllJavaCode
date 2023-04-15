package Basic;


import java.util.Scanner;

//10- Take 3 int inputs from user and check and print the result.
//	all are equal
//	any of two are equal
//	( use && ||)
public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int fNumber = sc.nextInt();
        System.out.print("Enter Second number :- ");
        int sNumber = sc.nextInt();
        System.out.print("Enter third number :- ");
        int tNumber = sc.nextInt();
        if((fNumber == sNumber) &&  (sNumber == tNumber)){
            System.out.println("All are Equals");
        } else if (fNumber == sNumber || fNumber == tNumber || sNumber == tNumber ) {
            System.out.println("Any of two are equals");
        }else {
            System.out.println("Not Equal");
        }

    }

}

package Basic;


import java.util.Scanner;

//11- Accept two numbers and print the greatest between them
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number :- ");
        int fNumber = sc.nextInt();
        System.out.print("Enter Second Number :- ");
        int sNumber = sc.nextInt();
        if(fNumber>sNumber){
            System.out.println("First Number is Greater");
        }else {
            System.out.println("Second Number is Greater");
        }
    }
}

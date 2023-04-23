package Basic;


import java.util.Scanner;

//Accept a number and print its reverse
public class Q_43_RevrseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        rNumWhile(num);
    }
    public static void rNumWhile(int num){
        int reverse = 0;
        while (num >0){
            int rem = num %10;
            reverse = reverse *10  + rem;
            num = num /10;
        }
        System.out.println("Revrese of Number :- " + reverse);
    }
}

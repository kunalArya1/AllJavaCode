package Basic;


import java.util.Scanner;

//Seprate each digit of a number and print it on the new line
public class Q_40_PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :- ");
        int n = sc.nextInt();
        int digit;
        while (n > 0 ){
            digit=n%10;
            System.out.println(digit);
            n = n/10;
        }
        StringDigit(n);
    }
    public static void StringDigit(int num){
        String Sting_Number = Integer.toString(num);
        for (int i = 0; i < Sting_Number.length(); i++) {
            System.out.println(Sting_Number.charAt(i));
        }
    }
}

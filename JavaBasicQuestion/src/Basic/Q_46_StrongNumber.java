package JavaBasicQuestion.src.Basic;


import java.util.Scanner;

//Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
// Ex- 145 = 1! + 4! + 5! = 145
public class Q_46_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int temp = num;
        int factSum = 0;
        while ( num > 0){
            int digit = num % 10;
            int factorial = 1;
            for (int i = 1; i<= digit ;i++ ){
                factorial = (factorial * i);
            }
            factSum += factorial;
            num = num / 10;
        }
        if (factSum == temp){
            System.out.println("Given Number is a Strong Number");
        }else System.out.println("Given Number is not a Strong Number");

    }
}

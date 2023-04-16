package Basic;


import java.util.Scanner;

//Accept the parameters and calculate the Compound Interest & print it on STDOUT (Use Math class methods)
public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount :- ");
        double principle = sc.nextDouble();
        System.out.print("Enter rate :- ");
        double rate = sc.nextDouble();
        System.out.print("Enter time span :- ");
        double timeSpan = sc.nextDouble();

        // Calculating Amount
        double amount = (principle*(Math.pow((1+(rate/100)),timeSpan)));
        System.out.println(amount);
        System.out.println("Compound Interest :- " +(amount-principle));
    }

}

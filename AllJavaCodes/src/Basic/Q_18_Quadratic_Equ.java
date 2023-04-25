package Basic;

import java.util.Scanner;
//Accept the value of a, b, c - The values in a quadratic equation and find its roots.
public class Q_18_Quadratic_Equ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value :- ");
        double a = sc.nextDouble();
        System.out.print("Enter second value :- ");
        double b = sc.nextDouble();
        System.out.print("Enter third value :- ");
        double c = sc.nextDouble();
        double root1,root2;
        double d = (Math.pow(b,2)-(4*a*c));

        //  if d > 0 , then roots are real and diffn
        if (d>0){
             root1 = ((-b+Math.sqrt(d))/(2*a));
             root2 = ((-b-Math.sqrt(d))/(2*a));
            System.out.println("Roots of given qud eqn is :- " +"( "+root1 +" , "+ root2 + ")");
        }
        // if d == 0 , then roots are equal and real
        // so root1=root2= -b /(2*a)
        else if (d == 0) {
            root1=root2= (-b /(2*a));
            System.out.println("Roots of given qud eqn is :- " +"( "+root1 +" , "+ root2 + ")");
        }
        // if d < 0 , then the roots are complex and diff
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots of given qud eqn is :- " +"( "+real +" , "+ imaginary+ "i"+ ")");
        }


    }
}

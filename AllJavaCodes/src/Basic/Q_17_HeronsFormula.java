package Basic;

import java.util.Scanner;

//Accept the three sides of triangle and calculate the area using herons formula
public class Q_17_HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of triangle :- ");
        int fSide = sc.nextInt();
        System.out.print("Enter Second side of triangle :- ");
        int sSide = sc.nextInt();
        System.out.print("Enter third side of triangle :- ");
        int tSide = sc.nextInt();
        int semiP = ((fSide+sSide+tSide)/2);

        double area = Math.sqrt((semiP*(semiP-fSide)*(semiP-sSide)*(semiP-tSide)));
        System.out.println("Area is :- " + area);
    }
}

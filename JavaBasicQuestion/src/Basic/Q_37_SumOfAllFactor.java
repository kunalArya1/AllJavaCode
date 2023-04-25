package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43
public class Q_37_SumOfAllFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- " );
        int n = sc.nextInt();
        int allFactorSum = 0;
        for (int i = 1; i <= (n/2); i++) {
            if (n%i==0){
                allFactorSum += i;
//                System.out.println(i);
            }
        }
        System.out.println(allFactorSum);
    }

}

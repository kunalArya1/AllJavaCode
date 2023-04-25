package JavaBasicQuestion.src.Basic;


import java.util.Scanner;

//Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
// Ex - 12321 - Rerverse - 12321
public class Q_44_PallindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number :- ");
        int num = sc.nextInt();
        pallNumber(num);
    }
    public static void pallNumber(int num ){
        int r,sum=0,temp;
        temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

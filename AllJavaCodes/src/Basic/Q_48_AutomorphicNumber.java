package Basic;


import java.util.Scanner;

//Automorphic number 5 = 25 = 625 = 390625
public class Q_48_AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
//        method1(num);
        method2(num);
    }
    public static void method2(int num ){
        String length = "" + num;
        int squNum = (int)Math.pow(num,2);
        int endDigit = squNum % (int)Math.pow(10,length.length());
        if(endDigit == num ){
            System.out.println("Automporphic number");
        }else{
            System.out.println("Not Automporphic number");
        }
    }
    public static void method1(int num){
        int temp = num ;
        int squNum = (int)Math.pow(num,2);
        int digitCont = 0;
        while (num > 0){
            num = num / 10;
            digitCont++;
        }
        int endDigit =squNum % (int)Math.pow(10,digitCont);
        if(endDigit == temp ){
            System.out.println("Automporphic number");
        }else{
            System.out.println("Not Automporphic number");
        }
    }
}

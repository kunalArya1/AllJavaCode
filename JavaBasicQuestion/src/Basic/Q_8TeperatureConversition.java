package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

public class Q_8TeperatureConversition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Farn : ");
        int farn = sc.nextInt();
        System.out.println("Temperature in celsius : " +TemperatureConv(farn));
    }
//    public static double TemperatureConv(int far){
//        return ((far-32)/1.8);
//    }
}

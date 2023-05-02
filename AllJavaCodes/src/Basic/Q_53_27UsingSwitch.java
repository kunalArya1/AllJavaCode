package Basic;

import java.util.Scanner;

//Accept an english alphabet from user and check if it is a consonent or a vowel using switch
public class Q_53_27UsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:-  ");
        String word = sc.next();
        char ch  = word.charAt(0);
        switch (ch) {
            case 'a' -> System.out.println("vowel");
            case 'e' -> System.out.println("vowel");
            case 'i' -> System.out.println("vowel");
            case 'o' -> System.out.println("vowel");
            case 'u' -> System.out.println("vowel");
            case 'A' -> System.out.println("vowel");
            case 'E' -> System.out.println("vowel");
            case 'I' -> System.out.println("vowel");
            case 'O' -> System.out.println("vowel");
            case 'U' -> System.out.println("vowel");
            default -> System.out.println("consonant");

        }
    }
}


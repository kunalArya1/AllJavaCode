package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Accept an english alphabet from user and check if it is a consonent or a vowel;
public class Q_27_VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Alphabet :- ");
        String word = sc.nextLine();
        char alp = word.charAt(0);
        if (alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o'
                || alp == 'u' || alp == 'A' || alp == 'E' || alp == 'I'
                || alp == 'O' || alp == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");

        }
    }



package Basic;


import java.util.Scanner;

//Print hello until user gives wrong input using do while
public class Q_49_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("hello");
             num = sc.nextInt();
        }while (num != 0);
    }
}

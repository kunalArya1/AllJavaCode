package AllJavaCodes.src.Recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        printNTo1(8);
    }
    public static void printNTo1(int n ){
        if(n == 0)
            return;
        printNTo1(n-1);
        System.out.println(n);

    }
}

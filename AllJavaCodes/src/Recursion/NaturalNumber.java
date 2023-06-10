package Recursion;

public class NaturalNumber {
    public static void main(String[] args) {
        natural_number_o(10);
    }
    static void natural_number_o(int n ){
        if(n == 0) {
            return;
        }
        System.out.print(n + ", ");
        natural_number_o(n-1);
    }
    static void natural_number_reverse(int  n){

    }

}

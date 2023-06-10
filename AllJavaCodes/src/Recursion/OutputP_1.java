package Recursion;

public class OutputP_1 {
    public static void main(String[] args) {
        fun(4);
    }
    static  void fun(int n ){
        if(n == 0)
            return;
        System.out.print(n + " ");
        fun(n-1);
        System.out.println(n);
    }
}

package Recursion;



public class functionClallWorkTwo {
    public static void main(String[] args) {
        print(1);
    }

    static  void print(int num ){
        System.out.println(num);
        print1(2);
    }

    static void print1(int num) {
        System.out.println(num);
        print2(3);
    }

    static void print2(int num) {
        System.out.println(num);
        print3(4);
    }
    static void print3(int num) {
        System.out.println(num);
        print4(5);
    }
    static void print4(int num) {
        System.out.println(num);

    }

}

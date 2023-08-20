package AllJavaCodes.src.Recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
//        printNToOne(9);
        printNToEk(5,1);
    }

    public static void printNToOne(int n ){
        if(n == 0)
            return;
        System.out.println(n);
        printNToOne(n-1);
    }

    public static void printNToEk(int n ,int k){
        if(n == 0)
            return;
        System.out.println(n);
        printNToEk(n-1,k+1);
    }
}

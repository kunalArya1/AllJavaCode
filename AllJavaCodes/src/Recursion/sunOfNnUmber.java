package Recursion;

public class sunOfNnUmber {
    public static void main(String[] args) {
        sum(19);
    }
    static int sum(int n ){
        int sumd=0;
        if(n == 0){
            return sumd;
        }
        sumd+= n;
        sum(n-1);
        return 0;
    }
}

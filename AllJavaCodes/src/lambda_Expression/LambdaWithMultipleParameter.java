package lambda_Expression;
interface mulPar{
    public void add(int a1, int b1);
    default void print(){
        System.out.println("NON ABSTRACT METHOD");
    }
}
public class LambdaWithMultipleParameter {
    public static void main(String[] args) {
        mulPar mp = (a,b) -> {
            System.out.println(a+b);
        };
    mp.add(10,30);
    mp.print();

    }
}

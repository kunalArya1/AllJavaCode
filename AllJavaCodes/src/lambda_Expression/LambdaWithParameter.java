package AllJavaCodes.src.lambda_Expression;
interface hello{
    public void display(String str);
    default void print(){
        System.out.println("Non Abstract Method");
    }
}
public class LambdaWithParameter {
    public static void main(String[] args) {
        hello h = (s) ->{
            System.out.println(s);
        };

        h.display("KUNAL ARYA");
        h.print();
    }

}

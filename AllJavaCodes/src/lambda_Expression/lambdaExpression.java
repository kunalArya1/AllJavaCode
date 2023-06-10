package lambda_Expression;
interface  yourlambda{
   public void display();
   default void print(){
       System.out.println("Lambda non abstract method");
   }
}
public class lambdaExpression {
    public static void main(String[] args) {
        yourlambda yl = () ->{
            System.out.println("yourLambda abstract method");
        };

        yl.display();
        yl.print();

    }
}

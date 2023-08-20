package AllJavaCodes.src.lambda_Expression;
@FunctionalInterface
 interface mylambda {
    public void display();
 default void print(){
        System.out.println("goole");
    }

}

//class lambda implements mylambda{
//    @Override
//    public void display() {
//        System.out.println("Kunal Kumar");
//    }
//}
public class functionalInterface {
    public static void main(String[] args) {
        mylambda ml = new mylambda() {
            @Override
            public void display() {
                System.out.println("kunal");
            }
        };
        ml.display();
        ml.print();


    }
}

package JavaBasicQuestion.src.exceptionHandling;

public class tryAndCatch {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Division by Zero is not allowed  " + e);
        }
        System.out.println("Bye");
    }
}

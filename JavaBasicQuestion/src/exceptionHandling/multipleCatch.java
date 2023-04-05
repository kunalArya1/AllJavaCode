package exceptionHandling;

public class multipleCatch {
    public static void main(String[] args) {
        int arr[] ={10,4,20,30};
        try {
            int r=arr[0]/arr[1];
            System.out.println(r);
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are accessing invalid index  " + e);
        }
        System.out.println("Bye");

    }
}

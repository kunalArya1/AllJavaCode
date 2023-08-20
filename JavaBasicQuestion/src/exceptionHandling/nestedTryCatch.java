package JavaBasicQuestion.src.exceptionHandling;

public class nestedTryCatch {
    public static void main(String[] args) {

        try{
            int arr[] ={10,0,20,30,40};
            try {
                int r = arr[0]/arr[1];
                System.out.println(r);
            }catch (ArithmeticException e){
                System.out.println("Division By Zero Is Not Allowed  " + e);
            }

            System.out.println(arr[10]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index  " + e);
        }
    }
}

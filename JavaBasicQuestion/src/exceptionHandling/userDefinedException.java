package JavaBasicQuestion.src.exceptionHandling;
class lowBalanceException extends Exception{
    public String toString(){
        return "Min Balance Should Not be less 500";
    }
}
public class userDefinedException {

        static void fun1(){
            try {
                throw new lowBalanceException();
            }catch (lowBalanceException e){
                System.out.println(e);
            }
        }
        static  void fun2(){
            fun1();
        }

    public static void main(String[] args) {
        fun2();
    }

}

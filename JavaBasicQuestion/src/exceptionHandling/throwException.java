package JavaBasicQuestion.src.exceptionHandling;

public class throwException {
    static void meth1(){
        try {
            int a=meth2(-10,5);
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static int meth2(int l,int b) throws Exception{
        if(l<0 || b <0 )
            throw new Exception("Length and breadth cannot be negative");
        return l*b;
    }

    public static void main(String[] args) {
        meth1();
    }
}

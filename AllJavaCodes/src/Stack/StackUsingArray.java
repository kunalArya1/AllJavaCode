package AllJavaCodes.src.Stack;


class MyStack{
    int [] arr;

    public MyStack(int val) {
        arr = new int [val];
    }

    public static int Size(int [] arr){
        return arr.length;
    }
    public static boolean isEmpty(int [] arr){
        return arr.length == 0;
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);
    }
}

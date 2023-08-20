package AllJavaCodes.src.multiThreading;
class  myThread extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(i + " Hello ");
            i++;
        }
    }
}
public class threadExample1 {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.start();
        int i = 1;
        while (true){
            System.out.println(i + " World");
            i++;
        }
    }
}

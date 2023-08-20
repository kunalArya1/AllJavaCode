package AllJavaCodes.src.multiThreading;

public class threadExample2 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        threadExample2 t2 =new threadExample2();
        t2.start();
        int i = 1;
        while (true){
            System.out.println(i + " World");
        }
    }
}

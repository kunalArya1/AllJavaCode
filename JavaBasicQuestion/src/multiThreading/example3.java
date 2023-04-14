package multiThreading;

public class RunnableExampl2  implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableExampl2 r2 = new RunnableExampl2();
        Thread th = new Thread(r2);
        th.start();
        th.start();
        int i = 1;
        while (true){
            System.out.println(i + "World ");            System.out.println(i + "World ");



        }

    }
}

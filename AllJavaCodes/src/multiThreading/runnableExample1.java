package multiThreading;
 class test implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(i + " Hello");
            i++;
        }
    }
}
 public class runnableExample1  {
     public static void main(String[] args) {
         test t = new test();
         Thread th = new Thread(t);
         th.start();
         int i = 1;
         while (true){
             System.out.println(i + " World");
             i++;
         }
     }
}


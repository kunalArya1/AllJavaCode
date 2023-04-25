package multiThreading;

public class oneFlow {
    static void display(){
        int i = 1;
        while (true){
            System.out.println(i + " hello");
        }
    }

    public static void main(String[] args) {
        display();
        int i =1;
        while (true){                       //This is not going to be run but we want both to run
            System.out.println(i + " World");
        }
    }
}

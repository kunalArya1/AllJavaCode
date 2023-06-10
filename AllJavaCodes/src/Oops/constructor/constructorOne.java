package Oops.constructor;

public class constructorOne {
    public static void main(String[] args) {
        kunal k = new kunal();
    }
}


class kunal{
    String name;
    int roll;
    // Non-Parametrize constructor
    kunal(){
        System.out.println("Kunal constructor is called...");
    }
}

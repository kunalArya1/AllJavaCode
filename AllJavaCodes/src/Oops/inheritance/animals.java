package AllJavaCodes.src.Oops.inheritance;

public class animals {
    public static void main(String[] args) {
        fish p = new fish();
        p.color="red";
        p.swim();


    }
}
class animal{
    String color;
    public static void eat(){
        System.out.println("Eats ");
    }
    public static void breadth(){
        System.out.println("Breadth");
    }
}

class fish extends animal{
    public static void swim(){
        System.out.println("Can Swim Also");
    }
    public static void die(){
        System.out.println("Can die without water");
    }
}
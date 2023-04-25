package Oops.methodOverriding;
class parent{
    public void display(){
        System.out.println("Hello from parent class");
    }
}
class child extends parent{
    public void display(){
        System.out.println("Hello from child class");
    }
}
public class example1 {
    public static void main(String[] args) {
        parent p = new parent();
//        p.display();
        child c = new child();
        c.display(); //here we cannot call parent class method because it get shadowed
    }
}

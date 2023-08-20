package AllJavaCodes.src.Oops.polymorphism.methodOverriding;
class car{
    public void start(){
        System.out.println("Car has started");
    }
    public void changeGear(){
        System.out.println("Car has changed gear");
    }
}
class luxCar extends car{
    @Override
    public void start(){
        System.out.println("LuxCar has started");
    }
    @Override
    public void changeGear(){
        System.out.println("LuxCar has changed gear");
    }
    public void musicSys(){
        System.out.println("LuxCar has music System");
    }
}
public class carExample {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.changeGear();
        luxCar lc = new luxCar();
        lc.start();
        lc.changeGear();
        lc.musicSys();

    }
}

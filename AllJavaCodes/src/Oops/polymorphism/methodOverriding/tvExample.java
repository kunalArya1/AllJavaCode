package AllJavaCodes.src.Oops.polymorphism.methodOverriding;
class tv{
    public void switchOn(){
        System.out.println("Tv Switched On");
    }
    public void changeChannel(){
        System.out.println("Tv channel Changed");
    }
}
class smartTv extends tv{
    @Override
    public void switchOn(){
        System.out.println("Smart tv switched On");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart tv channel Changed");
    }
    public void browsing(){
        System.out.println("Smart tv has browser");
    }
}
public class tvExample {
    public static void main(String[] args) {
        tv t = new tv();
        t.switchOn();
        t.changeChannel();
        smartTv st = new smartTv();
        st.switchOn();
        st.changeChannel();
        st.browsing();
    }
}

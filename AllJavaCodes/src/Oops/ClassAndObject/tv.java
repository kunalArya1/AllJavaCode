package Oops.ClassAndObject;
 class television{
    public int channel;
    private int volume;

    public static void changeChannel(){
        System.out.println("Channel Changed");
    }
    public static void changeVolume(){
        System.out.println("Volume Changed");
    }
}
public class tv {
    public static void main(String[] args) {
        television t = new television();
        t.changeChannel();
        t.changeVolume();
    }
}



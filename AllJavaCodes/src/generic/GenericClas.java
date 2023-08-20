package AllJavaCodes.src.generic;

public class GenericClas<T> {
    T data[] =(T[]) new Object[3];
    public static void main(String[] args) {

        GenericClas<String> gd = new GenericClas<>();
        gd.data[0]="kunal";
        gd.data[1]="Kumar";
//        gd.data[2]=10;
//        gd.data[2]=new Integer(10);
        gd.data[2] ="Maa";

        String str = gd.data[1];
}
}

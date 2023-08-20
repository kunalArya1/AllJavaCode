package AllJavaCodes.src.Oops.constructor;

public class parameterizeConstructor {
    public static void main(String[] args) {
        student1 s1 = new student1("kunal Arya",1);
        System.out.println(s1.name+" and " + s1.roll);
    }
}

class student1{
    String name;
    int roll;
    student1(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

}
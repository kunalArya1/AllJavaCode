package AllJavaCodes.src.Oops.constructor;

public class copyConstructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name="Ram";
        s1.roll=1;
        s1.marks[0]=90;
        s1.marks[1]=99;
        s1.marks[2]=98;
        s1.password="KuchBhiHai";
        student s2 = new student(s1);
        System.out.println(s1.marks[0]);
        System.out.println(s2.marks[0]);
    }
}

class student {
    String name;
    int marks[] = new int[3];
    int roll;
    String password;
    student(student s){
        s.name="Kunal Arya";
        s.roll= 90;
        s.password ="RamHai";
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s.marks[i];
        }
        this.marks[0]=80;
    }

    student(){
        System.out.println("Constructor is called...");
    }
}
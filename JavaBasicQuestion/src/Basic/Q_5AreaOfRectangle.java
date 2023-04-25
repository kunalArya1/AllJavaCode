package JavaBasicQuestion.src.Basic;

import java.util.Scanner;

//Accept the length and breadth of a rectangle.Calculate & print the area and perimiter
public class Q_5AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght : " );
        int lenght = sc.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = sc.nextInt();
        System.out.println("Area Of Rectangle : "+ AreaOfRectangle(lenght,breadth));
        System.out.println("Perimeter Of Rectangle : "+PerimeterOfRectangle(lenght,breadth));
    }
    public static int AreaOfRectangle(int l,int b){
        return (l*b);
    }
    public static int PerimeterOfRectangle(int l,int b){
        return  (2*(l+b));
    }
}

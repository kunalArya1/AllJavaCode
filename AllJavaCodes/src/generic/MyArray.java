package generic;
class array<T >{
    T array[] = (T[]) new  Object[10];
    int length = 0;
    public void append(T v){
        array[length++] =v;

    }
    public void Display(){
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
class array2<T> extends array<T>{

}

// Bounded Types

class arry3 <T extends Number>{

}
public class MyArray {
    public static void main(String[] args) {
        array<Integer> ma = new array<>();
        ma.append(10);
        ma.append(20);
        ma.append(40);
//        ma.Display();

        // No parameter
        array np = new array();
        np.append(10);
        np.append("Kunal");
        np.append('k');

//        mp.Display();

        // Multiple Parameter
//        array<Integer,String> mp = new array<>();

        // SubTypes








    }
}

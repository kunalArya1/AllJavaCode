package generic;
import java.util.*;
class GenericData<T>{
    private  T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }

}

public class Data {

    public static void main(String[] args) {
        GenericData<Integer> db = new GenericData<>();
        db.setData(10);
        System.out.println(db.getData());
    }

}



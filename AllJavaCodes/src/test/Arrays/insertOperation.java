package AllJavaCodes.src.test.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class insertOperation {
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        int numbertoadded= 10;
        int position = 2;

        insert(arr,numbertoadded,position);

    }
    public static String insert(int arr[],int numbertoadded,int position){
        for (int i = arr.length-2; i >= position-1; i--) {
            arr[i+1]=arr[i];

        }
        arr[position-1]=numbertoadded;

        System.out.println(Arrays.toString(arr));
        return "Element added";

    }
}

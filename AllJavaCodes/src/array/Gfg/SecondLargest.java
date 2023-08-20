package AllJavaCodes.src.array.Gfg;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {10,30,12,34,50,7,18,45};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        int sLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != largest){
                if(arr[i] > sLargest){
                    sLargest = arr[i];
                }
            }
        }

        System.out.println("Largest Element : - " + largest);
        System.out.println("Second Largest Element :- " + sLargest);
    }
}

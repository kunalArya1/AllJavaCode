package Basic;

public class Q_77_ShortedArrayOrNot {
    public static void main(String[] args) {
        int [] arr = {7,6,2,4,3,2};
        boolean isShorted = true;
        if (arr[0] > arr[1]){
            for (int i = 0; i < (arr.length-1); i++) {
                if (arr[i] < arr[i+1]){
                    isShorted = false;
                    break;
                }
            }
        }else{
            for (int i = 0; i < (arr.length-1); i++) {
               if (arr[i] > arr[i+1]){
                   isShorted = false;
                   break;
               }
            }
        }

        if (isShorted){
            System.out.println("shorted");
        }else {
            System.out.println("not shorted");
        }
    }
}

package AllJavaCodes.src.Lt_test;
import java.util.*;
public class moveZero {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        for(int i = 0; i< nums.length-1 ;i++){
            if(nums[i] == 0 ){
                int temp = nums[i];
                if(nums[i+1] ==0) {
                    i++;
                }
                nums[i] =nums[i+1];
                nums[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

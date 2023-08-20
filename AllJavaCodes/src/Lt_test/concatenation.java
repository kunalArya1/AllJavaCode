package AllJavaCodes.src.Lt_test;

import java.util.Arrays;

public class concatenation {

    public static void main(String[] args) {
        int [] nums = {1,2,3};

        getConcatenation(nums);

    }
    public static void getConcatenation(int[] nums) {
//            int size = ;
            int j = 0;
            int ans[] = new int[2 * nums.length];
            for(int i = 0 ; i< ans.length ; i++ ){
                if( i < nums.length){
                    ans[i]=nums[i];
                }else{
                    ans[i] = nums[j];
                    j++;
                }
            }

        System.out.println(Arrays.toString(ans));
    }
}


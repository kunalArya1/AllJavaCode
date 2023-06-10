package Lt_test;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] ={3,2,3};
        int m = nums.length/2;
        for(int i=1;i<= nums.length;i++){
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[j]== i){
                    count++;
                }
            }
            if(count > m){
                System.out.println(i);
            }

        }
        System.out.println("nhi mila");
    }
}

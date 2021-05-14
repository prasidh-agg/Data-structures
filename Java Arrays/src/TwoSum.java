import java.util.Arrays;

public class TwoSum {
    public static int[] getTwoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length; i++){
            int temp = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==temp){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        throw new IllegalArgumentException("No answer");
    }
    public static void main(String[] args) {
        int[] nums = {3,4};
        int[] twoSum = TwoSum.getTwoSum(nums, 7);
        System.out.println(Arrays.toString(twoSum));
    }
}

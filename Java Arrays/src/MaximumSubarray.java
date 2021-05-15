public class MaximumSubarray {
    public static int getMaxSumSubArray(int[] nums){
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        
        return maxSubarray;
    }
    public static void main(String[] args) {
        int[] numbers= {-2,1,-3,4,-1,2,1,-5,4};
        int maxSumSubArray = MaximumSubarray.getMaxSumSubArray(numbers);
        System.out.println(maxSumSubArray);
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {
  public static int[] getTwoSumHash(int[] nums, int target) {
    Map<Integer, Integer> hashMap = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (hashMap.containsKey(complement)) {
        return new int[] { hashMap.get(complement), i };
      }
      hashMap.put(nums[i], i);
    }
    throw new IllegalArgumentException("Two Sum Not Found");
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    int[] twoSum = TwoSumHash.getTwoSumHash(nums, 8);
    System.out.println(Arrays.toString(twoSum));
  }
}

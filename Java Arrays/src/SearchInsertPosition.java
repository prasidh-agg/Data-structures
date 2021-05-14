public class SearchInsertPosition {
  public static int getInsertPosition(int[] nums, int target) {
    int arrayEnd = nums.length;
    int center = nums.length / 2;
    int median = nums[center];
    int arrayBeg = 0;
    if (target < nums[0]) {
      return 0;
    }
    if (target > nums[arrayEnd - 1]) {
      return arrayEnd + 1;
    }
    while (center != arrayBeg) {
      if (target > median) {
        arrayBeg = center;
      } else if (target < median) {
        arrayEnd = center;
      } else if (target == median) {
        return center;
      }
      center = (arrayEnd - arrayBeg) / 2 + arrayBeg;
      median = nums[center];
    }
    return center + 1;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 3, 5, 6 };
    int insertPosition = SearchInsertPosition.getInsertPosition(numbers, 0);
    System.out.println("The Insert Position for the number is : " + insertPosition);
  }
}

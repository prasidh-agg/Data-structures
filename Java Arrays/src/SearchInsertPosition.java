public class SearchInsertPosition {
  public static int getInsertPosition(int[] nums, int target) {
    int arrayEnd = nums.length - 1;
    int center;
    int arrayBeg = 0;
    while (arrayBeg <= arrayEnd) {
      center = (arrayEnd + arrayBeg) / 2;
      if (target == nums[center]) {
        return center;
      }
      if (target > nums[center]) {
        arrayBeg = center + 1;
      } else {
        arrayEnd = center - 1;
      }
    }
    return arrayBeg;
  }

  public static void main(String[] args) {
    int[] numbers = { 1 };
    int insertPosition = SearchInsertPosition.getInsertPosition(numbers, 0);
    System.out.println("The Insert Position for the number is : " + insertPosition);
  }
}

public class SearchInsertPosition {
  public static int getInsertPosition(int[] nums, int target) {
    int arrayEnd = nums.length-1; 
    int center;
    int res = -1;
    int arrayBeg = 0;
    while (arrayBeg <= arrayEnd) {
      center = (arrayEnd + arrayBeg) / 2;
      if(target == nums[center]){
       return center;
      }
      if (target > nums[center]) {
        arrayBeg = center + 1;
        res = center + 1;
      } else {
        arrayEnd = center-1;
        res = center; 
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 3, 5, 6 };
    int insertPosition = SearchInsertPosition.getInsertPosition(numbers, 2);
    System.out.println("The Insert Position for the number is : " + insertPosition);
  }
}

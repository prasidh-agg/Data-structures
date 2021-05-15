import java.util.Arrays;

public class MaxProductThreeNums_UsingSort {
    public static int getMaxProductThreeNumbers(int[] numbers){
        int size= numbers.length;
        Arrays.sort(numbers);
        return Math.max((numbers[0]*numbers[1]*numbers[size-1]),numbers[size-3]*numbers[size-2]*numbers[size-1]);
    }
    public static void main(String[] args) {
        int[] numbers= {-10,-20,3,4,5,6};
        int maxProductThreeNumbers = MaxProductThreeNums_UsingSort.getMaxProductThreeNumbers(numbers);
        System.out.println("The max product possible is: "+ maxProductThreeNumbers);
    }
}

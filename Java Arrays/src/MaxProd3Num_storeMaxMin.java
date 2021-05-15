
public class MaxProd3Num_storeMaxMin {
    public static int maxProd(int[] nums){
        int max1= Integer.MIN_VALUE, max2= Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int  min1 = Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for (int num : nums) {
            if(num>=max1){
                max3=max2;
                max2=max1;
                max1=num;
            } else if(num>=max2) {
                max3=max2;
                max2=num;
            } else if(num>=max3) {
                max3=num;
            }
            if(num<=min1){
                min2=min1;
                min1=num;
            }
            else if(num<=min2){
                min2=num;
            }       
        }
        return Math.max(max1*min1*min2, max1*max2*max3);
    }
    public static void main(String[] args) {
        int[] numbers = { 3, 2, 1, -5, -10 };
        int res = MaxProd3Num_storeMaxMin.maxProd(numbers);
        System.out.println("The Insert Position for the number is : " + res);
      }
}

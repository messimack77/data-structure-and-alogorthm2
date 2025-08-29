public class FindTheMissingNumber {


    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }


    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for(int num : nums ){
            sum = sum - num;
        }
        return sum;
    }
}

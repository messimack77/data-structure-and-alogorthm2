public class MoveAllZerosToTheEnd {


    public static void main(String[] args) {
        int[] array = {0, 8, 0, 0, 2, 1, 0, 3, 0};
        int[] movedZeros = sortArray(array);
        for (int i : movedZeros) {
            System.out.println(i);
        }

    }


    public static int[] sortArray(int[] nums) {
        for (int i = 0; i<nums.length; i++){
            for(int j = i + 1; j < nums[nums.length-1] / 2; j++){
                if (nums[j] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    private static int[] moveAllZerosToTheEnd(int[] numbers) {

        //0,8,5,0,2,1,0,3,0
        int j = 0; // tracks a position where the next zero element should go
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[j] == 0) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            if (numbers[j] != 0){
                j++;
            }
        }
      return numbers;
    }

}

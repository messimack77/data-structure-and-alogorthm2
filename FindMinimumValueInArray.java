public class FindMinimumValueInArray {

    public static int findMinimumValue(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        return min;
    }






    public static void main(String[] args) {
        int[] myArray = {5,6,7,4,1,7,-9};

        System.out.println(findMinimumValue(myArray));
    }
}



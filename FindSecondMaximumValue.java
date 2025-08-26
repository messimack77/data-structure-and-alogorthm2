public class FindSecondMaximumValue {


    public static int findSecondMaxValue(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        int secondMaxNumber = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i] > secondMaxNumber && numbers[i] < max){
                secondMaxNumber = numbers[i];
            }
        }

        return secondMaxNumber;
    }


    public static void main(String[] args) {
        int[] myArray = {5,60,7,4,10,90};
        System.out.println(findSecondMaxValue(myArray));
    }
}

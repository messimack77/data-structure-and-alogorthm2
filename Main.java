public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,3,6,4,7,1,9,8,2};

        int[] odds = removeEvenIntegers(numbers);
        for (int i = 0; i<odds.length; i++){
            System.out.println(odds[i]);
        }

    }

    public static int[] removeEvenIntegers(int[] myArray){
        //get a count of odd numbers in the array to create an array with the length of the odd count
        int oddCount = 0;
        for (int  i = 0; i<myArray.length; i++){
            if (myArray[i] % 2 != 0){
                oddCount++;
            }
        }

        int[] result = new int[oddCount]; // create an array with a length of odd count
        int idx = 0;
        for (int i = 0; i<myArray.length ; i++){
            if (myArray[i] % 2 != 0){  // filter the odd numbers and assign
                result[idx] = myArray[i]; // assigned the filtered odd number to the index of the result
                idx++;
            }
        }
        return result;
    }
}

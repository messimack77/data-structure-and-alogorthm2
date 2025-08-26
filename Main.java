public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,3,6,4,7,1,9,8,2};

        int[] odds = removeEvenIntegers(numbers);
        for (int i = 0; i<odds.length; i++){
            System.out.println(odds[i]);
        }

        int[] reversed = reverseArray(numbers);
        for (int i = 0; i<reversed.length; i++){
            System.out.println(reversed[i]);
        }

        int[] reversed2 = reverseArray2(numbers);
        for (int i = 0; i<reversed2.length; i++){
            System.out.println(reversed[i]);
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



    public static int[] reverseArray(int[] array){
        for (int i = 0; i<array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length -i- 1];
            array[array.length -i- 1] = temp;
        }
        return array;
    }



    public static int[] reverseArray2(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}

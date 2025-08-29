import java.util.HashSet;
import java.util.Set;

public class CheckIfTheStringIsPalindrome {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("momom"));
//        System.out.println(sqrt(2147395599));


//        System.out.println(isPalindrome("slmlmls"));


    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] evenNumbers = removeOddNumbers(numbers);

        for (int i : evenNumbers){
            System.out.print(i+" ");
        }
    }






//    public static boolean isPalindrome(String word){
//
//        char[] charArray = word.toCharArray();
//        int start = 0;
//        int end = charArray.length-1;
//        for (int i = 0; i<charArray.length; i++){
//            if (charArray[start] != charArray[end]){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }



    public static boolean isPalindrome(String text){

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        char[] charArray = cleaned.toCharArray();
//        m o m

        int start = 0;
        int end = charArray.length - 1;

        while (start < end){
            if (charArray[start] != charArray[end]){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

//    public boolean isPalindrome(String s) {
//        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "")
//                .toLowerCase();
//
//        char[] charArray = cleaned.toCharArray();
//
//        int start = 0;
//        int end = charArray.length-1;
//        for(int i = 0; i<charArray.length-1; i++){
//            if(charArray[start] != charArray[end]){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }

    public static int sqrt(int x){
        if (x == 0){
            return 0;
        }

        if (x == 1){
            return 1;
        }

        int start = 0;
        int end = (start + (x * x)) / 2;

        while (start < end){
            if (((start * start) == x) || (((start + 1) * (start + 1)) > x)){
                return start;
            }
            start++;
            end--;
        }

        return -1;
    }


    public static int[] removeOddNumbers(int[] numbers){


        int evenCount = 0;
        for (int j : numbers) {
            if (j % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];
        int idx = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[idx] = number;
                idx++;
            }
        }
        return evenNumbers;
    }
}

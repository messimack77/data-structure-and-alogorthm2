public class ResizeArray {

    public static void main(String[] args) {
        int[] array = {2,1,5,4};


        int[] resizedArray = resizeArray(array, 8);
        for (int i = 0; i<resizedArray.length; i++){
            System.out.println(resizedArray[i]);
        }

    }


    public static int[] resizeArray(int[] array, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i<array.length; i++){
            temp[i] = array[i];
        }
        array = temp;

        return array;
    }
}

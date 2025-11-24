public class CheckForNearbyDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        System.out.println(checkForNearbyDuplicates(nums,3 ));
    }

    public static boolean checkForNearbyDuplicates(int[] array, int k){
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j <= k+i && j < array.length; j++){
                if (array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

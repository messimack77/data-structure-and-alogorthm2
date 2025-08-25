public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        long now = System.currentTimeMillis(); // get current time in milli seconds
        System.out.println(main.findSum(99999));
        System.out.println(System.currentTimeMillis() - now); // get the time taken to run the algorithm

        // we can  check the time time taken by each algorithm by commenting out one of the algorithms at a time
    }

//    public int findSum(int n){
//        return n * (n + 1);
//    }


    public int findSum(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}

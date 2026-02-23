import java.util.List;

public class SinglyLinkedList {

    private ListNode head;


    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int lengthOfLinkedList(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertNodeInTheBeginning(int data){
        ListNode newListNode = new ListNode(data);
        newListNode.next = head;
        head = newListNode;
    }




    public void insertNodeAtTheEnd(int data){
        ListNode current = head;
        ListNode newNode = new ListNode(data);

        if (head == null){
            head = newNode;
            return;
        }
        while (current.next != null){
            current = current.next;
        }
        newNode.next = null;
        current.next = newNode;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //1-> 2-> 3-> 4-> 5->null
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        for (int i = 0; i<n; i++){
            fastPointer = fastPointer.next;
        }

        if (fastPointer == null){
            return head.next;
        }

        while (fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        slowPointer = slowPointer.next.next;
        return head;
    }

    // 1-> 2-> 3-> 4-> null
    public  static void deleteTheLastNode(ListNode head){
        ListNode current = head;

        while (current.next.next != null){
            current = current.next;
        }

        current.next = null;
    }







        public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(2);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        sll.insertNodeInTheBeginning(16);
        sll.display();

        System.out.println("Delete from the end");

        deleteTheLastNode(sll.head);



        sll.display();




//
//        System.out.println("Size of linked list: "+sll.lengthOfLinkedList());
//
//
//
//        sll.insertNodeAtTheEnd(30);
//        sll.display();

//        int[] nums = {5,2,10,9,4,1,8,6,3};
////        System.out.println(checkForNearbyDuplicates(nums,3 ));
//
//            int[] nums1 = selectionSort(nums);
//            System.out.println("***********");
//            for (int i = 0; i< nums.length; i++){
//                System.out.println(nums1[i]);
//            }
//            System.out.println(isPrimeNumber(12));
//
//            System.out.println(countPrimes(5));



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


    public static int[] sort(int[] nums){
        //5,2,10,9,4,1,8,6,3
        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length -i- 1; j++){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    private static int[] selectionSort(int[] nums){
        int max = nums[0];
        for (int i = 1; i< nums.length; i++){
            for (int j = i; j<nums.length - 1; j++){
                if (nums[i] > max){
//                    max = nums[i];
                    int temp = nums[i];
                    nums[max] = nums[i];
                    nums[i] = temp;

                }
            }

        }
        return nums;
    }



    public static boolean isPrimeNumber(int n){
        for (int i = 2; i<n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {
        int count = 0;
        int[] array = new int[n];
        for (int i = 1; i<n; i++){
            array[i] = i;
        }

        //1,2,3,4,5


        for (int i = 2; i<array.length; i++){
            for (int j = 2; j<array[i]; j++){
                if (array[i] % j == 0){
                    break;
                } else {
                    count++;
                }
            }
        }
        return count;

    }

}

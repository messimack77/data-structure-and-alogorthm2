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

    public void insertNodeInGivenPosition(int data, int position){
        ListNode listNode = new ListNode(data);
        int count = 1;

        if (position == 1){   // if position is 1, no need to traverse, we just insert the node in the beginning
            listNode.next =head;
            head = listNode;
        } else {
        ListNode current = head;
        while (count < position-1){
            current = current.next;
            count++;
        }
        listNode.next = current.next;
        current.next = listNode;
        }
    }

    // head->1-> 2-> 3 -> null
    public void deleteTheFirstNode(){
        if (head == null){
            return;
        }
        head = head.next;
    }



    public void deleteMiddleNode() {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        ListNode previousNode = head;

        while (fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            previousNode = slowPointer;
            slowPointer = slowPointer.next;
        }


        previousNode.next = slowPointer.next;
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

//        sll.insertNodeInTheBeginning(16);
//        sll.display();
//
//        System.out.println("Size of linked list: "+sll.lengthOfLinkedList());
//
//
//
//        sll.insertNodeAtTheEnd(30);
//        sll.display();

//        sll.insertNodeInGivenPosition(9, 2);
//        sll.display();

//        sll.deleteTheFirstNode();
        sll.display();
//


        System.out.println("----------");
        sll.deleteMiddleNode();
        sll.display();
    }

}

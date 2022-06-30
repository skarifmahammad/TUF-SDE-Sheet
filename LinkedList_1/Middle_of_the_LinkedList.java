package LinkedList_1;

public class Middle_of_the_LinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode slow = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
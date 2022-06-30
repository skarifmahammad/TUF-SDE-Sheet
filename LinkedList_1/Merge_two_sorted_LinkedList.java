package LinkedList_1;

public class Merge_two_sorted_LinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode marge = new ListNode();
        ListNode head = marge;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                marge.val = list1.val;
                list1 = list1.next;
            } else {
                marge.val = list2.val;
                list2 = list2.next;
            }
            if (list1 != null && list2 != null) {
                marge.next = new ListNode();
                marge = marge.next;
            }
        }
        if (list2 == null) {
            marge.next = list1;
        }
        if (list1 == null) {
            marge.next = list2;
        }
        return head;
    }
}

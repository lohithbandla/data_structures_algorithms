public class DeleteLastNode {
    public static ListNode deleteLastNode(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return head;
    }
}

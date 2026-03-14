public class LengthOfLoop {

    public static int lengthofLoop(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle found → countnnnnn length
                int count = 1;
                ListNode temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        return 0; // No cycle
    }
}
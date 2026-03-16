public class ReverseLLkGroup {
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);

        int k = 3;

        ReverseLLkGroup obj = new ReverseLLkGroup();
        ListNode newHead = obj.Reversek(head, k);

        // Print result
        ListNode temp = newHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode Reversek(ListNode head, int k) {
        ListNode resultHead = getKthNode(head, k);
        ListNode curr = head;
        ListNode prev = new ListNode(-1);
        while (curr != null) {
            ListNode kthNode = getKthNode(curr, k);
            if (kthNode == null) {
                prev.next = curr;
                return resultHead;
            }
            ListNode storeNode = kthNode.next;
            kthNode.next = null;
            ListNode reversedHead = reverseLL(curr);
            prev.next = reversedHead;
            prev = curr;
            curr = storeNode;
        }
        return resultHead;

    }

    public ListNode getKthNode(ListNode node, int k) {
        k = k - 1;
        while (k-- > 0) {
            node = node.next;
            if (node == null) {
                return null;
            }
        }
        return node;
    }

    public static ListNode reverseLL(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

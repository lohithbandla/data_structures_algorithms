
public class ReverseLL {

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

    public static void main(String[] args) {

        ListNode head = null;

        // Creating list: 10 -> 20 -> 30 -> 40
        head = InsertHeadSingly.insertAtHead(head, 40);
        head = InsertHeadSingly.insertAtHead(head, 30);
        head = InsertHeadSingly.insertAtHead(head, 20);
        head = InsertHeadSingly.insertAtHead(head, 10);

        System.out.println("Original List:");
        printList(head);

        head = reverseLL(head);

        System.out.println("Reversed List:");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}
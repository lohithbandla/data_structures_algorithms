class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class InsertHeadSingly {
    public static ListNode insertAtHead(ListNode head, int val) {
        ListNode temp = new ListNode(val);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = null;

        head = insertAtHead(head, 10);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 30);
        head = insertAtHead(head, 40);

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}

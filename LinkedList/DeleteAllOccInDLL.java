public class DeleteAllOccInDLL {
    public static void main(String[] args) {
        // Creating doubly linked list: 1 <-> 2 <-> 3 <-> 2 <-> 4 <-> 2
        DoublyListNode head = new DoublyListNode(1);
        DoublyListNode n2 = new DoublyListNode(2);
        DoublyListNode n3 = new DoublyListNode(3);
        DoublyListNode n4 = new DoublyListNode(2);
        DoublyListNode n5 = new DoublyListNode(4);
        DoublyListNode n6 = new DoublyListNode(2);

        head.next = n2;
        n2.prev = head;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        n5.next = n6;
        n6.prev = n5;

        DeleteAllOccInDLL obj = new DeleteAllOccInDLL();

        System.out.println("Original List:");
        printList(head);

        head = obj.deleteAllOcc(head, 2);

        System.out.println("After deleting 2:");
        printList(head);
    }

    public DoublyListNode deleteAllOcc(DoublyListNode head, int key) {
        DoublyListNode newHead = head;

        while (newHead.val == key) {
            newHead = newHead.next;
        }

        newHead.prev = null;
        DoublyListNode prev = newHead;
        DoublyListNode curr = newHead.next;

        while (curr != null) {
            if (curr.val != key) {
                prev.next = curr;
                curr.prev = prev;
                prev = curr;
                if (curr.next != null) {
                    curr = curr.next;
                } else {
                    return newHead;
                }
            } else {
                curr = curr.next;
            }

        }
        prev.next = null;
        return newHead;

    }

    public static void printList(DoublyListNode head) {
        DoublyListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

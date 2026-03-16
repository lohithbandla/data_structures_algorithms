import java.util.ArrayList;
import java.util.List;

public class FindPairsGivenSum {
    public static void main(String[] args) {

        DoublyListNode head = new DoublyListNode(1);
        DoublyListNode n2 = new DoublyListNode(2);
        DoublyListNode n3 = new DoublyListNode(3);
        DoublyListNode n4 = new DoublyListNode(4);
        DoublyListNode n5 = new DoublyListNode(5);
        DoublyListNode n6 = new DoublyListNode(6);

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

        FindPairsGivenSum obj = new FindPairsGivenSum();
        List<List<DoublyListNode>> ans = obj.findSumPairs(head, 7);

        for (List<DoublyListNode> pair : ans) {
            System.out.println(pair.get(0).val + " " + pair.get(1).val);
        }
    }

    public List<List<DoublyListNode>> findSumPairs(DoublyListNode head, int k) {
        DoublyListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        List<List<DoublyListNode>> res = new ArrayList<>();

        while (head != tail) {
            if (head.val + tail.val == k) {
                List<DoublyListNode> l = new ArrayList<>();
                l.add(head);
                l.add(tail);
                res.add(l);
                head = head.next;
                tail = tail.prev;
            } else if (head.val + tail.val > k) {
                tail = tail.prev;
            } else {
                head = head.next;
            }
        }
        return res;

    }

}

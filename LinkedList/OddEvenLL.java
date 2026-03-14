/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddFirst = odd;
        ListNode evenFirst = even;

        while (odd != null || even != null) {
            if (even.next == null) {
                odd.next = evenFirst;
                break;
            }
            odd.next = even.next;
            odd = odd.next;

            if (odd.next == null) {
                odd.next = evenFirst;
                even.next = null;
                break;
            }
            even.next = odd.next;
            even = even.next;

        }
        return oddFirst;
    }
}
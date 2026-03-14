// /**
// * Definition for singly-linked list.
// * class ListNode {
// * int val;
// * ListNode next;
// * ListNode(int x) {
// * val = x;
// * next = null;
// * }
// * }
// */
// public class Solution {
// public ListNode detectCycle(ListNode head) {
// ListNode slow = head;
// ListNode fast = head;

// while(fast != null && fast.next != null && slow != null){
// slow = slow.next;
// fast = fast.next.next;
// if(slow == fast){
// ListNode temp = head;
// ListNode run = fast;
// while(temp != run){
// temp = temp.next;
// run = run.next;
// }
// return run;
// }
// }
// return null;

// }
// }
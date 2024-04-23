/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            boolean isDuplicate = false;

            while (current.next != null && current.val == current.next.val) {
                current = current.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }
}
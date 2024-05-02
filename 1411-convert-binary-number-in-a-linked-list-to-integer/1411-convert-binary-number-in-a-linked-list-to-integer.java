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
    public int getDecimalValue(ListNode head) {

      StringBuilder result = new StringBuilder();
        
      
        while (head != null) {
          
            result.append(head.val);
            head = head.next;
        }
        
       
        return Integer.parseInt(result.toString(), 2);
        
    }
}
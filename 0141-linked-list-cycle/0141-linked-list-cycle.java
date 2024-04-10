/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         HashSet map = new HashSet<>();
 ListNode temp = head;

 while(temp!=null)
 {
     if(map.contains(temp))
     {
         return true;
     }
     else
     {
         map.add(temp);
     }
     temp=temp.next;
 }
 return false;






        
        
    }   
}
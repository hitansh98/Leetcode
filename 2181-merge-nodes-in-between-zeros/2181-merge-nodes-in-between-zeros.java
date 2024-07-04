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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        int sum = 0;
        ListNode result = new ListNode();
        ListNode resultTemp = result;
        
        while(temp != null) {
           if(temp.next != null && temp.next.val == 0) {
               sum += temp.val;
               resultTemp.next = new ListNode(sum);
               resultTemp = resultTemp.next;
               sum = 0;
           } else {
               sum += temp.val;
           }
            temp = temp.next;
        }
        
        return result.next;
    }
}
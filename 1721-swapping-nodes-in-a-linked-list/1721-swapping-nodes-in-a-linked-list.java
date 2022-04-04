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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode left = head;
        
        ListNode right = head;
        
        int count = 1;
        while(curr != null){
            if(count < k){
                left = left.next;
            }
            if(count > k){
                right = right.next;
            }
            
            curr = curr.next;
            count++;
        }
        
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        
        return head;
        
    }
}
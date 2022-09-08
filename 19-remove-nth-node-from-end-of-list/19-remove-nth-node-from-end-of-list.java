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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode prev = null;
        // ListNode dummy = newhead
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        
        while(n-->0){
            ptr2 = ptr2.next;
        }
        
        if(ptr2==null){
            head = ptr1.next;
            return head;
        }
        
        while(ptr2!=null){
            ptr2 = ptr2.next;
            prev = ptr1;
            ptr1 = ptr1.next;
        }
        
        if(ptr2==null){
            prev.next = ptr1.next;
        }
        return head;
    }
}
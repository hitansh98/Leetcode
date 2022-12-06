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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode head2 = head.next;
        ListNode prev1 = null;
        ListNode prev2 = null;
        
        while(ptr1 != null  && ptr1.next != null && ptr2 !=null && ptr2.next != null){
            prev1 = ptr1;
            prev2 = ptr2;
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next.next;
            prev1.next = ptr1;
            prev2.next = ptr2;
        }
        
        ptr1.next = head2;
        
        return head;
        
        
    }
}
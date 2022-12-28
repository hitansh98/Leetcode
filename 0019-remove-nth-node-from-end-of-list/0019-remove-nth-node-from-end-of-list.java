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
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        
        for(int i=0;i<n;i++){
            ptr1 = ptr1.next;
        }
        
        ListNode prevStore = null;
        
        while(ptr1!=null){
            ptr1 = ptr1.next;
            prevStore = ptr2;
            ptr2 = ptr2.next;
        }
        
        if(prevStore==null){
            head = head.next;
            return head;
        }
            
        prevStore.next = ptr2.next;
            
        return head;
        
    }
}
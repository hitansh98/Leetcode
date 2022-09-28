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
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode prev = null;
        
        while(n-->0){
            
            temp = temp.next;
        }
        
        
    
        while(temp!=null){
            prev = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        
        if(temp2 == head){
            head = temp2.next;
            return head;
        }
        
        prev.next = temp2.next;
        
        return head;
    }
}
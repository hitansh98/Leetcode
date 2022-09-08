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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        
        //finding middle of LL
        while(ptr2!=null && ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        
        
        //for odd cases.
        if(ptr2!=null){
            ptr1 = ptr1.next;
        }
        
        ptr1 = reverse(ptr1);
        ptr2 = head;
        
        while(ptr1!=null){
            if(ptr1.val != ptr2.val) return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}